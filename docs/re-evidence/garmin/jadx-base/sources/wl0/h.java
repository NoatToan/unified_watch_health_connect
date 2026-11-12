package wl0;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.text.TextUtils;
import bs2.ad;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.DataTransferCallback;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.lib.connectdevicesync.DeviceSyncService;
import com.google.common.primitives.UnsignedBytes;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes8.dex */
public class h extends hc2.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static h f185925k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f185926l = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f185927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f185928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<com.garmin.android.apps.connectmobile.golf.truswing.model.k> f185929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<com.garmin.android.apps.connectmobile.golf.truswing.model.b> f185930h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f185931i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f185932j;

    public class a implements e {
        @Override // wl0.e
        public final void onClubListRequestFailed(long j8, e.a aVar) {
            a2 a2Var = a2.GOLF;
            StringBuilder sbK = ds.e0.k(j8, "Failed to retrieve club list from device ", ", Status: ");
            sbK.append(aVar.name());
            i2.f(a2Var, "GolfSensorDataManager", sbK.toString());
        }

        @Override // wl0.e
        public final void onClubListRetrieved(long j8, List<com.garmin.android.apps.connectmobile.golf.truswing.model.a> list, long j14) {
            i2.a(a2.GOLF, "GolfSensorDataManager", "Received club list. " + ((ArrayList) list).size() + " clubs, active club: " + j14);
            h hVarI = h.i();
            if (hVarI != null) {
                hVarI.r(list);
                hVarI.q(j14);
            }
        }
    }

    public class b implements DataTransferCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f185933a;

        public b(h hVar, Context context) {
            this.f185933a = context;
        }

        @Override // com.garmin.android.apps.connectmobile.gfdi.protobuf.DataTransferCallback
        public final void onDataTransferComplete(long j8, byte[] bArr) {
            Locale locale = Locale.ENGLISH;
            Long lValueOf = Long.valueOf(j8);
            ad adVar = ad.GOLF_SWING;
            String str = String.format(locale, "%d_00_%02x%02x_%d.fit", lValueOf, 128, Short.valueOf(adVar.f19675a), Long.valueOf(System.currentTimeMillis()));
            StringBuilder sb3 = new StringBuilder();
            Context context = this.f185933a;
            sb3.append(context.getFilesDir());
            sb3.append("/cache/truswing");
            String string = sb3.toString();
            File file = new File(string);
            if (!file.isDirectory() && !file.mkdirs()) {
                pl0.c cVar = new pl0.c(j8);
                oi2.a.f132270a.getClass();
                l73.c.b().e(cVar);
                return;
            }
            File file2 = new File(string, str);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                try {
                    bufferedOutputStream.write(bArr);
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                    bufferedOutputStream.close();
                    i2.a(a2.GOLF, "GolfSensorDataManager", "Swing data saved to file: " + file2.getName());
                    String strD = ((cl0.b) KoinJavaComponent.get(cl0.b.class)).d(j8);
                    if (strD != null) {
                        Logger logger = DeviceSyncService.f49910d;
                        if (TextUtils.isEmpty(strD)) {
                            vb.h.s("macAddress is empty");
                            return;
                        }
                        Intent intent = new Intent(context, (Class<?>) DeviceSyncService.class);
                        intent.setAction("com.garmin.android.lib.sync.DeviceSyncService.ACTION_REQUEST_REAL_TIME_SYNC_UPLOAD");
                        intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_ID", j8);
                        intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_MAC_ADDRESS", strD);
                        intent.putExtra("com.garmin.android.lib.sync.DeviceSyncService.EXTRA_FILE_DIR", string);
                        intent.putExtra("com.garmin.android.lib.sync.DeviceSyncService.EXTRA_FILE_NAMES", new String[]{str});
                        intent.putExtra("com.garmin.android.lib.sync.DeviceSyncService.EXTRA_FILE_DATA_TYPES", new byte[]{UnsignedBytes.MAX_POWER_OF_TWO});
                        intent.putExtra("com.garmin.android.lib.sync.DeviceSyncService.EXTRA_FILE_DATA_SUB_TYPES", new byte[]{(byte) adVar.f19675a});
                        intent.putExtra("com.garmin.android.lib.sync.DeviceSyncService.EXTRA_PROGRESS_VISIBILITY_POLICY", wb2.j.INVISIBLE.name());
                        dc2.a aVarC = DeviceSyncService.c();
                        if (aVarC != null) {
                            aVarC.f(context, intent);
                        }
                    }
                    pl0.b bVar = new pl0.b(j8);
                    oi2.a.f132270a.getClass();
                    l73.c.b().e(bVar);
                } catch (Throwable th3) {
                    try {
                        bufferedOutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (IOException unused) {
                pl0.c cVar2 = new pl0.c(j8);
                oi2.a.f132270a.getClass();
                l73.c.b().e(cVar2);
            }
        }

        @Override // com.garmin.android.apps.connectmobile.gfdi.protobuf.DataTransferCallback
        public final void onDataTransferFailed(long j8) {
            pl0.c cVar = new pl0.c(j8);
            oi2.a.f132270a.getClass();
            l73.c.b().e(cVar);
        }

        @Override // com.garmin.android.apps.connectmobile.gfdi.protobuf.DataTransferCallback
        public final void onDataTransferProgress(long j8, int i14) {
            pl0.d dVar = new pl0.d(j8, i14);
            oi2.a.f132270a.getClass();
            l73.c.b().e(dVar);
        }

        @Override // com.garmin.android.apps.connectmobile.gfdi.protobuf.DataTransferCallback
        public final void onDataTransferStarted(long j8) {
            pl0.e eVar = new pl0.e(j8);
            oi2.a.f132270a.getClass();
            l73.c.b().e(eVar);
        }
    }

    public class c implements t13.d<v2<? extends List<com.garmin.android.apps.connectmobile.golf.truswing.model.b>>> {
        public c() {
        }

        @Override // t13.d
        /* JADX INFO: renamed from: getContext */
        public final t13.g getF129302c() {
            return t13.h.f161748a;
        }

        @Override // t13.d
        public final void resumeWith(Object obj) {
            boolean z14 = obj instanceof v2.b;
            h hVar = h.this;
            if (z14) {
                hVar.f185930h = (List) ((v2.b) obj).f47386a;
            } else {
                hVar.f185929g = null;
            }
        }
    }

    private h(Context context) {
        super(context);
        this.f185931i = -1L;
        this.f185932j = -1;
        this.f185927e = new b(this, context);
    }

    public static synchronized h i() {
        h hVar = f185925k;
        if (hVar != null) {
            return hVar;
        }
        i2.f(a2.GOLF, "GolfSensorDataManager", "Not yet initialized! This class should have been initialized by calling init() on app startup.");
        return null;
    }

    public static long m() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(14, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(11, 0);
        return (calendar.getTimeInMillis() / 1000) - 631065600;
    }

    public static void n(Context context) {
        if (f185925k != null) {
            i2.f(a2.GOLF, "GolfSensorDataManager", "Already initialized! Why are you calling me again? You should be calling getInstance() instead!");
        } else {
            f185925k = new h(context.getApplicationContext());
            i2.a(a2.GOLF, "GolfSensorDataManager", "TruSwingDataManager initialized successfully.");
        }
    }

    public static boolean o() {
        return ((cl0.b) KoinJavaComponent.get(cl0.b.class)).j();
    }

    public final void g() {
        ArrayList arrayList = this.f185928f;
        if (arrayList != null) {
            arrayList.clear();
        }
        setChanged();
        notifyObservers(new hc2.c.a(hc2.c.a.EnumC1639a.NEW_CLUB_LIST, this.f185928f));
        clearChanged();
    }

    public final ArrayList h(boolean z14) {
        ArrayList arrayList = this.f185928f;
        if (arrayList != null && arrayList.size() > 0) {
            return this.f185928f;
        }
        if (z14 && o()) {
            i2.a(a2.GOLF, "GolfSensorDataManager", "Requesting clubs.  Not sure why we did not get them when the device connected.");
            ((cl0.b) KoinJavaComponent.get(cl0.b.class)).s(this.f83289a, ((cl0.b) KoinJavaComponent.get(cl0.b.class)).q(), f185926l);
        }
        return new ArrayList();
    }

    public final String j(short s8) {
        List<com.garmin.android.apps.connectmobile.golf.truswing.model.b> list = this.f185930h;
        if (list != null) {
            for (com.garmin.android.apps.connectmobile.golf.truswing.model.b bVar : list) {
                if (bVar.f35897a == s8) {
                    return bVar.f35898b;
                }
            }
        }
        return this.f83289a.getString(R.string.sensor_unknown);
    }

    public final int k() {
        return (int) DatabaseUtils.queryNumEntries(this.f83290b, "swings", "time_stamp >= ? AND club_swing_file IS NOT NULL", new String[]{String.valueOf(m())});
    }

    public final ArrayList l() {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = this.f83290b.query("swings", hc2.c.b.f83298a0, "time_stamp >= ? AND club_swing_file IS NOT NULL", new String[]{String.valueOf(m())}, null, null, null);
                if (cursorQuery != null) {
                    while (cursorQuery.moveToNext()) {
                        arrayList.add(hc2.c.e(cursorQuery));
                    }
                }
                return arrayList;
            } catch (Exception e4) {
                i2.e(a2.GOLF, "GolfSensorDataManager", e4);
                return arrayList;
            }
        } finally {
            hc2.c.b(cursorQuery);
        }
    }

    public final void p(Context context) {
        if (this.f185930h == null) {
            this.f185930h = new ArrayList();
        }
        this.f185930h.add(new com.garmin.android.apps.connectmobile.golf.truswing.model.b(1, context.getString(R.string.club_type_driver), 45.5d, 10.5d, 58.5d, "8°-12°"));
        this.f185930h.add(new com.garmin.android.apps.connectmobile.golf.truswing.model.b(2, context.getString(R.string.club_type_3wood), 43.0d, 15.0d, 56.5d, "13°-17°"));
        this.f185930h.add(new com.garmin.android.apps.connectmobile.golf.truswing.model.b(3, context.getString(R.string.club_type_5wood), 42.5d, 18.5d, 57.0d, "18°-22°"));
        this.f185930h.add(new com.garmin.android.apps.connectmobile.golf.truswing.model.b(4, context.getString(R.string.club_type_1hybrid), 41.0d, 15.0d, 57.5d, "14°-16°"));
        this.f185930h.add(new com.garmin.android.apps.connectmobile.golf.truswing.model.b(5, context.getString(R.string.club_type_2hybrid), 40.5d, 17.0d, 58.0d, "17°-18°"));
        this.f185930h.add(new com.garmin.android.apps.connectmobile.golf.truswing.model.b(6, context.getString(R.string.club_type_3hybrid), 40.0d, 19.0d, 58.5d, "19°-21°"));
        this.f185930h.add(new com.garmin.android.apps.connectmobile.golf.truswing.model.b(7, context.getString(R.string.club_type_4hybrid), 39.5d, 22.0d, 59.0d, "22°-23°"));
        this.f185930h.add(new com.garmin.android.apps.connectmobile.golf.truswing.model.b(8, context.getString(R.string.club_type_5hybrid), 39.0d, 24.0d, 59.5d, "24°-27°"));
        this.f185930h.add(new com.garmin.android.apps.connectmobile.golf.truswing.model.b(9, context.getString(R.string.club_type_6hybrid), 38.5d, 28.0d, 60.0d, "28°-32°"));
        this.f185930h.add(new com.garmin.android.apps.connectmobile.golf.truswing.model.b(10, context.getString(R.string.club_type_1iron), 39.5d, 16.0d, 58.0d, ""));
        this.f185930h.add(new com.garmin.android.apps.connectmobile.golf.truswing.model.b(11, context.getString(R.string.club_type_2iron), 39.0d, 18.5d, 58.66999816894531d, ""));
        this.f185930h.add(new com.garmin.android.apps.connectmobile.golf.truswing.model.b(12, context.getString(R.string.club_type_3iron), 38.5d, 21.0d, 59.31999969482422d, ""));
        this.f185930h.add(new com.garmin.android.apps.connectmobile.golf.truswing.model.b(13, context.getString(R.string.club_type_4iron), 38.0d, 24.0d, 60.02000045776367d, ""));
        this.f185930h.add(new com.garmin.android.apps.connectmobile.golf.truswing.model.b(14, context.getString(R.string.club_type_5iron), 37.5d, 27.0d, 60.75d, ""));
        this.f185930h.add(new com.garmin.android.apps.connectmobile.golf.truswing.model.b(15, context.getString(R.string.club_type_6iron), 37.0d, 30.5d, 61.5d, ""));
        this.f185930h.add(new com.garmin.android.apps.connectmobile.golf.truswing.model.b(16, context.getString(R.string.club_type_7iron), 36.5d, 34.0d, 62.279998779296875d, ""));
        this.f185930h.add(new com.garmin.android.apps.connectmobile.golf.truswing.model.b(17, context.getString(R.string.club_type_8iron), 36.0d, 38.0d, 63.099998474121094d, ""));
        this.f185930h.add(new com.garmin.android.apps.connectmobile.golf.truswing.model.b(18, context.getString(R.string.club_type_9iron), 35.5d, 42.0d, 63.95000076293945d, ""));
        this.f185930h.add(new com.garmin.android.apps.connectmobile.golf.truswing.model.b(19, context.getString(R.string.club_type_pitching_wedge), 35.5d, 46.0d, 64.37999725341797d, "46°-49°"));
        this.f185930h.add(new com.garmin.android.apps.connectmobile.golf.truswing.model.b(20, context.getString(R.string.club_type_gap_wedge), 35.5d, 50.0d, 64.37999725341797d, "50°-53°"));
        this.f185930h.add(new com.garmin.android.apps.connectmobile.golf.truswing.model.b(21, context.getString(R.string.club_type_sand_wedge), 35.25d, 54.0d, 64.69999694824219d, "54°-57°"));
        this.f185930h.add(new com.garmin.android.apps.connectmobile.golf.truswing.model.b(22, context.getString(R.string.club_type_lob_wedge), 35.0d, 58.0d, 65.11000061035156d, "58°-64°"));
        g22.f.a("LoadGolfClubTypes", new g(this, 0));
    }

    public final void q(long j8) {
        this.f185931i = j8;
        setChanged();
        notifyObservers(new hc2.c.a(hc2.c.a.EnumC1639a.NEW_ACTIVE_CLUB, Long.valueOf(j8)));
        clearChanged();
    }

    public final void r(List<com.garmin.android.apps.connectmobile.golf.truswing.model.a> list) {
        ArrayList arrayList = this.f185928f;
        if (arrayList == null) {
            this.f185928f = new ArrayList();
        } else {
            arrayList.clear();
        }
        if (list != null) {
            this.f185928f.addAll(list);
        }
        setChanged();
        notifyObservers(new hc2.c.a(hc2.c.a.EnumC1639a.NEW_CLUB_LIST, this.f185928f));
        clearChanged();
    }

    public final void s(int i14) {
        this.f185932j = i14;
        setChanged();
        notifyObservers(new hc2.c.a(hc2.c.a.EnumC1639a.NEW_BATTERY_STATUS, Integer.valueOf(i14)));
        clearChanged();
        if (i14 < 25) {
            com.garmin.android.apps.connectmobile.z.f49770a.getClass();
            com.garmin.android.apps.connectmobile.z.f49774e.j(new com.garmin.android.apps.connectmobile.y());
        }
    }
}
