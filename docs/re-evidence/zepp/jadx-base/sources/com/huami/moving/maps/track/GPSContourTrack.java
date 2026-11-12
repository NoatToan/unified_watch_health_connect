package com.huami.moving.maps.track;

import android.util.SparseArray;
import com.huami.mifit.sportlib.model.GPSPoint;
import com.huami.mifit.sportlib.model.ParsedSportDetailData;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class GPSContourTrack {
    private static final String d = "GPSContourTrack";
    private List<a> a;
    private long b;
    private int c;

    public static class LoadData {
        public GPSPoint a;
        public GPSPoint b;
        public SparseArray<List<GPSPoint>> c;
        public LinkedHashMap<Integer, ParsedSportDetailData> complexMyTrackData;
        public LinkedHashMap<Integer, Trackrecord> complexTrackRecord;
        public SparseArray<List<GPSPoint>> complexTracks;
        public boolean d;
        public List<GPSPoint> marked;
        public List<GPSPoint> track;
    }

    public static final class a {
        public static final String d = "h";
        public static final String e = "v";
        public static final String f = "t";
        private short a;
        private short b;
        private short c;

        public a(short s, short s2, short s3) {
            this.a = (short) 0;
            this.b = (short) 0;
            this.c = (short) 0;
            this.a = s;
            this.b = s2;
            this.c = s3;
        }

        public JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("h", (int) this.a);
                jSONObject.put("v", (int) this.b);
                jSONObject.put("t", (int) this.c);
            } catch (JSONException e2) {
                HMLog.e(GPSContourTrack.d, e2.getMessage(), new Object[0]);
            }
            return jSONObject;
        }

        public short b() {
            return this.c;
        }

        public short c() {
            return this.a;
        }

        public short d() {
            return this.b;
        }
    }

    public GPSContourTrack(int i, long j) {
        this.a = null;
        this.b = 0L;
        this.c = 0;
        this.c = i;
        this.b = j;
        this.a = new ArrayList();
    }

    private JSONArray a() {
        if (this.a == null) {
            HMLog.i("IllegalArgumentException", "GPSContourTrack getPointListJson", new Object[0]);
            throw new IllegalStateException();
        }
        JSONArray jSONArray = new JSONArray();
        for (a aVar : this.a) {
            if (aVar != null) {
                jSONArray.put(aVar.a());
            }
        }
        return jSONArray;
    }

    public List<a> getPointList() {
        return this.a;
    }

    public long getTrackId() {
        return this.b;
    }

    public void setPointList(List<a> list) {
        if (list != null) {
            this.a.addAll(list);
        } else {
            HMLog.i("IllegalArgumentException", "GPSContourTrack setPointList", new Object[0]);
            throw new IllegalArgumentException();
        }
    }

    public String toString() {
        return "TrackId:" + this.b + ",Data:" + a().toString();
    }
}
