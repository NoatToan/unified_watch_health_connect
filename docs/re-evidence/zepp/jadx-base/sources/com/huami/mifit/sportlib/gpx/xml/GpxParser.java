package com.huami.mifit.sportlib.gpx.xml;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.huami.mifit.sportlib.gpx.data.GPXDocument;
import com.huami.mifit.sportlib.gpx.data.GPXRoute;
import com.huami.mifit.sportlib.gpx.data.GPXRoutePoint;
import com.huami.mifit.sportlib.gpx.data.GPXSegment;
import com.huami.mifit.sportlib.gpx.data.GPXTrack;
import com.huami.mifit.sportlib.gpx.data.GPXTrackPoint;
import com.huami.mifit.sportlib.gpx.data.GPXWayPoint;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

/* JADX INFO: loaded from: classes11.dex */
public class GpxParser implements GpxParserHandler.GpxParserProgressListener {
    private static final String h = "GpxParser";
    private InputStream a;
    private GpxParserListener e;
    private GpxParserHandler.GpxParserProgressListener f;
    private ArrayList<GPXTrack> b = new ArrayList<>();
    private ArrayList<GPXRoute> c = new ArrayList<>();
    private ArrayList<GPXWayPoint> d = new ArrayList<>();
    private Handler g = null;

    public interface GpxParserListener {
        void onGpxParseCompleted(GPXDocument gPXDocument);

        void onGpxParseError(String str, String str2, int i, int i2);

        void onGpxParseStarted();
    }

    public class a implements Runnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ GPXTrack b;

        public a(int i, GPXTrack gPXTrack) {
            this.a = i;
            this.b = gPXTrack;
        }

        @Override // java.lang.Runnable
        public void run() {
            GpxParser.this.f.onGpxNewTrackParsed(this.a, this.b);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ GPXRoute b;

        public b(int i, GPXRoute gPXRoute) {
            this.a = i;
            this.b = gPXRoute;
        }

        @Override // java.lang.Runnable
        public void run() {
            GpxParser.this.f.onGpxNewRouteParsed(this.a, this.b);
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ GPXSegment b;

        public c(int i, GPXSegment gPXSegment) {
            this.a = i;
            this.b = gPXSegment;
        }

        @Override // java.lang.Runnable
        public void run() {
            GpxParser.this.f.onGpxNewSegmentParsed(this.a, this.b);
        }
    }

    public class d implements Runnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ GPXTrackPoint b;

        public d(int i, GPXTrackPoint gPXTrackPoint) {
            this.a = i;
            this.b = gPXTrackPoint;
        }

        @Override // java.lang.Runnable
        public void run() {
            GpxParser.this.f.onGpxNewTrackPointParsed(this.a, this.b);
        }
    }

    public class e implements Runnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ GPXRoutePoint b;

        public e(int i, GPXRoutePoint gPXRoutePoint) {
            this.a = i;
            this.b = gPXRoutePoint;
        }

        @Override // java.lang.Runnable
        public void run() {
            GpxParser.this.f.onGpxNewRoutePointParsed(this.a, this.b);
        }
    }

    public class f implements Runnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ GPXWayPoint b;

        public f(int i, GPXWayPoint gPXWayPoint) {
            this.a = i;
            this.b = gPXWayPoint;
        }

        @Override // java.lang.Runnable
        public void run() {
            GpxParser.this.f.onGpxNewWayPointParsed(this.a, this.b);
        }
    }

    public class g extends AsyncTask<Void, Void, Boolean> {

        public class a implements Runnable {
            public final /* synthetic */ String a;

            public a(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                GpxParser.this.e.onGpxParseError("IOException", this.a, -1, -1);
            }
        }

        public class b implements Runnable {
            public final /* synthetic */ String a;
            public final /* synthetic */ int b;
            public final /* synthetic */ int c;

            public b(String str, int i, int i2) {
                this.a = str;
                this.b = i;
                this.c = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                GpxParser.this.e.onGpxParseError("SAXException", this.a, this.b, this.c);
            }
        }

        public class c implements Runnable {
            public final /* synthetic */ String a;

            public c(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                GpxParser.this.e.onGpxParseError("ParserConfigurationException", this.a, -1, -1);
            }
        }

        private g() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            GpxParserHandler gpxParserHandler;
            SAXException e;
            GpxParser.this.g = new Handler(Looper.getMainLooper());
            try {
                try {
                    XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
                    gpxParserHandler = new GpxParserHandler(GpxParser.this);
                    try {
                        xMLReader.setContentHandler(gpxParserHandler);
                        xMLReader.parse(new InputSource(GpxParser.this.a));
                        GpxParser.this.a.close();
                        return Boolean.TRUE;
                    } catch (SAXException e2) {
                        e = e2;
                        Log.e(GpxParser.h, "SAXException " + e.getMessage());
                        GpxParser.this.g.post(new b(e.getMessage(), gpxParserHandler != null ? gpxParserHandler.getErrorLine() : -1, gpxParserHandler != null ? gpxParserHandler.getErrorColumn() : -1));
                        return Boolean.FALSE;
                    }
                } catch (SAXException e3) {
                    gpxParserHandler = null;
                    e = e3;
                }
            } catch (IOException e4) {
                Log.e(GpxParser.h, "IOException " + e4.getMessage());
                GpxParser.this.g.post(new a(e4.getMessage()));
                return Boolean.FALSE;
            } catch (ParserConfigurationException e5) {
                Log.e(GpxParser.h, "ParserConfigurationException " + e5.getMessage());
                GpxParser.this.g.post(new c(e5.getMessage()));
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            if (bool.booleanValue()) {
                GpxParser.this.e.onGpxParseCompleted(new GPXDocument(GpxParser.this.d, GpxParser.this.b, GpxParser.this.c));
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            GpxParser.this.e.onGpxParseStarted();
        }
    }

    public GpxParser(InputStream inputStream, GpxParserListener gpxParserListener, GpxParserHandler.GpxParserProgressListener gpxParserProgressListener) {
        this.a = null;
        this.e = null;
        this.f = null;
        if (inputStream == null) {
            throw new IllegalArgumentException("gpxIs is null");
        }
        if (gpxParserListener == null) {
            throw new IllegalArgumentException("listener is null");
        }
        this.a = inputStream;
        this.e = gpxParserListener;
        this.f = gpxParserProgressListener;
    }

    @Override // com.huami.mifit.sportlib.gpx.xml.GpxParserHandler.GpxParserProgressListener
    public void onGpxNewRouteParsed(int i, GPXRoute gPXRoute) {
        this.c.add(gPXRoute);
        if (this.f != null) {
            this.g.post(new b(i, gPXRoute));
        }
    }

    @Override // com.huami.mifit.sportlib.gpx.xml.GpxParserHandler.GpxParserProgressListener
    public void onGpxNewRoutePointParsed(int i, GPXRoutePoint gPXRoutePoint) {
        if (this.f != null) {
            this.g.post(new e(i, gPXRoutePoint));
        }
    }

    @Override // com.huami.mifit.sportlib.gpx.xml.GpxParserHandler.GpxParserProgressListener
    public void onGpxNewSegmentParsed(int i, GPXSegment gPXSegment) {
        if (this.f != null) {
            this.g.post(new c(i, gPXSegment));
        }
    }

    @Override // com.huami.mifit.sportlib.gpx.xml.GpxParserHandler.GpxParserProgressListener
    public void onGpxNewTrackParsed(int i, GPXTrack gPXTrack) {
        this.b.add(gPXTrack);
        if (this.f != null) {
            this.g.post(new a(i, gPXTrack));
        }
    }

    @Override // com.huami.mifit.sportlib.gpx.xml.GpxParserHandler.GpxParserProgressListener
    public void onGpxNewTrackPointParsed(int i, GPXTrackPoint gPXTrackPoint) {
        if (this.f != null) {
            this.g.post(new d(i, gPXTrackPoint));
        }
    }

    @Override // com.huami.mifit.sportlib.gpx.xml.GpxParserHandler.GpxParserProgressListener
    public void onGpxNewWayPointParsed(int i, GPXWayPoint gPXWayPoint) {
        this.d.add(gPXWayPoint);
        if (this.f != null) {
            this.g.post(new f(i, gPXWayPoint));
        }
    }

    public void parse() {
        new g().execute(new Void[0]);
    }
}
