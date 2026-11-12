package com.huami.mifit.sportlib.gpx.print;

import android.os.AsyncTask;
import android.util.Log;
import com.huami.mifit.sportlib.gpx.data.GPXDocument;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/* JADX INFO: loaded from: classes11.dex */
public class GPXFilePrinter {
    private GPXDocument a;
    private String b;
    private GPXFilePrinterListener c;

    public interface GPXFilePrinterListener {
        void onGPXPrintCompleted();

        void onGPXPrintError(String str);

        void onGPXPrintStarted();
    }

    public class a extends AsyncTask<Void, Void, Boolean> {
        private static final String c = "PrinterTask";
        private String a;

        private a() {
            this.a = null;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            try {
                PrintStream printStream = new PrintStream(new FileOutputStream(GPXFilePrinter.this.b));
                GPXFilePrinter.this.a.toGpx(printStream);
                printStream.close();
                return Boolean.TRUE;
            } catch (FileNotFoundException e) {
                String str = "FileNotFoundException " + e.getMessage();
                this.a = str;
                Log.e(c, str);
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            if (bool.booleanValue()) {
                GPXFilePrinter.this.c.onGPXPrintCompleted();
            } else {
                GPXFilePrinter.this.c.onGPXPrintError(this.a);
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            GPXFilePrinter.this.c.onGPXPrintStarted();
        }
    }

    public GPXFilePrinter(GPXDocument gPXDocument, String str, GPXFilePrinterListener gPXFilePrinterListener) {
        this.a = null;
        this.b = null;
        this.c = null;
        if (gPXDocument == null) {
            throw new IllegalArgumentException("doc must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("filePath must not be null");
        }
        if (gPXFilePrinterListener == null) {
            throw new IllegalArgumentException("listener must not be null");
        }
        this.a = gPXDocument;
        this.b = str;
        this.c = gPXFilePrinterListener;
    }

    public void print() {
        new a().execute(new Void[0]);
    }
}
