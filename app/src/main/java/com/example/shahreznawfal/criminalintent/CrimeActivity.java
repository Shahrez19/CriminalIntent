package com.example.shahreznawfal.criminalintent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class CrimeActivity extends SingleFragmentActivity {
    /** Called when the activity is first created. */
    @Override
    protected Fragment createFragment(){
        return new CrimeFragment();
    }
}