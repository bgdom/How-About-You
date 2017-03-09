package com.iut.appmob.whataboutyou.data;

import android.os.AsyncTask;
import android.view.View;

import com.iut.appmob.whataboutyou.Data;

/**
 * Created by guydo on 09/03/2017.
 */

public class FirstPicData implements Data {
    private boolean isFinished = false, isStarted = false;
    private View itemView;

    public FirstPicData() {

    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public boolean isStarted() {
        return isStarted;
    }

    @Override
    public void finish() {
        isStarted = true;
        FirstPicAsyncTask asyncTask = new FirstPicAsyncTask();
        asyncTask.execute();
    }

    @Override
    public void bind(View v) {
        itemView = v;
    }

    private static class FirstPicAsyncTask extends AsyncTask<String, Integer, Void> {

        @Override
        protected Void doInBackground(String... urls) {
            return null;
        }

        protected void onProgressUpdate(Integer... progress) {

        }

        @Override
        protected void onPostExecute(Void v) {

        }
    }
}
