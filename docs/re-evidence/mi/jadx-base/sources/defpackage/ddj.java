package defpackage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import com.brentvatne.exoplayer.ExoPlayerView;
import com.brentvatne.receiver.AudioBecomingNoisyReceiver;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.MergingMediaSource;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.source.p;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.source.v;
import com.google.android.exoplayer2.t;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.google.android.exoplayer2.upstream.f;
import com.miui.tsmclient.service.DKFRequestService;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"ViewConstructor"})
public class ddj extends FrameLayout implements LifecycleEventListener, q.c, gy1.a, zh2, AudioManager.OnAudioFocusChangeListener, stf {
    public static final pt5 U = new pt5();
    public static final CookieManager V;
    public Uri A;
    public String B;
    public boolean C;
    public String D;
    public Dynamic E;
    public String F;
    public Dynamic G;
    public String H;
    public Dynamic I;
    public ReadableArray J;
    public boolean K;
    public float L;
    public boolean M;
    public Map<String, String> N;
    public boolean O;
    public boolean P;
    public final g9p Q;
    public final AudioManager R;
    public final AudioBecomingNoisyReceiver S;
    public final Handler T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oqq f15402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PlayerControlView f15403b;
    public View c;
    public q.c d;
    public Handler e;
    public ExoPlayerView f;
    public com.google.android.exoplayer2.upstream.a.InterfaceC0205a g;
    public t h;
    public DefaultTrackSelector i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15404k;
    public long l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f15405r;
    public float s;
    public int t;
    public int u;
    public long v;
    public int w;
    public int x;
    public int y;
    public int z;

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1 && ddj.this.h != null && ddj.this.h.getPlaybackState() == 3 && ddj.this.h.n()) {
                ddj.this.f15402a.o(ddj.this.h.getCurrentPosition(), (((long) ddj.this.h.R()) * ddj.this.h.getDuration()) / 100, ddj.this.h.getDuration());
                sendMessageDelayed(obtainMessage(1), Math.round(ddj.this.L));
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ddj.this.K0();
        }
    }

    public class c implements q.c {
        public c() {
        }

        @Override // com.google.android.exoplayer2.q.c
        public void onPlayerStateChanged(boolean z, int i) {
            ddj ddjVar = ddj.this;
            ddjVar.d0(ddjVar.c);
            ddj.this.h.i(ddj.this.d);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ddj f15409a;

        public d(ddj ddjVar) {
            this.f15409a = ddjVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ddj.this.h == null) {
                ddj.this.i = new DefaultTrackSelector(ddj.this.getContext(), new com.google.android.exoplayer2.trackselection.a.b());
                ddj.this.i.N(ddj.this.i.o().h(ddj.this.u == 0 ? Integer.MAX_VALUE : ddj.this.u));
                vv5.a aVar = new vv5.a();
                aVar.b(new bt5(true, 65536));
                aVar.c(ddj.this.w, ddj.this.x, ddj.this.y, ddj.this.z);
                t.b bVar = new t.b(ddj.this.getContext());
                bVar.A(ddj.this.i);
                bVar.y(aVar.a());
                ddj.this.h = bVar.x();
                ddj.this.h.t(this.f15409a);
                ddj.this.h.D0(this.f15409a);
                ddj.this.f.setPlayer(ddj.this.h);
                ddj.this.S.b(this.f15409a);
                ddj.U.h(new Handler(), this.f15409a);
                ddj ddjVar = ddj.this;
                ddjVar.s0(!ddjVar.p);
                ddj.this.j = true;
                ddj.this.h.d(new n0i(ddj.this.f15405r, 1.0f));
            }
            if (ddj.this.j && ddj.this.A != null) {
                ArrayList arrayListO = ddj.this.O();
                ddj ddjVar2 = ddj.this;
                k kVarM = ddjVar2.M(ddjVar2.A, ddj.this.B);
                if (arrayListO.size() != 0) {
                    arrayListO.add(0, kVarM);
                    kVarM = new MergingMediaSource((k[]) arrayListO.toArray(new k[arrayListO.size()]));
                }
                boolean z = ddj.this.f15404k != -1;
                if (z) {
                    ddj.this.h.G(ddj.this.f15404k, ddj.this.l);
                }
                ddj.this.h.S0(kVarM, !z, false);
                ddj.this.j = false;
                ddj.this.f15402a.m();
                ddj.this.m = true;
            }
            ddj.this.Y();
            ddj ddjVar3 = ddj.this;
            ddjVar3.j0(ddjVar3.P);
            ddj.this.K();
        }
    }

    static {
        CookieManager cookieManager = new CookieManager();
        V = cookieManager;
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
    }

    public ddj(g9p g9pVar) {
        super(g9pVar);
        this.f15405r = 1.0f;
        this.s = 1.0f;
        this.t = 3;
        this.u = 0;
        this.v = -9223372036854775807L;
        this.w = SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH;
        this.x = SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH;
        this.y = 2500;
        this.z = 5000;
        this.L = 250.0f;
        this.M = false;
        this.O = false;
        this.T = new a();
        this.Q = g9pVar;
        this.f15402a = new oqq(g9pVar);
        R();
        this.R = (AudioManager) g9pVar.getSystemService("audio");
        g9pVar.addLifecycleEventListener(this);
        this.S = new AudioBecomingNoisyReceiver(g9pVar);
        X();
    }

    public static boolean Z(ExoPlaybackException exoPlaybackException) {
        if (exoPlaybackException.type != 0) {
            return false;
        }
        for (Throwable sourceException = exoPlaybackException.getSourceException(); sourceException != null; sourceException = sourceException.getCause()) {
            if (sourceException instanceof BehindLiveWindowException) {
                return true;
            }
        }
        return false;
    }

    public void A0(String str, Dynamic dynamic) {
        this.H = str;
        this.I = dynamic;
        B0(3, str, dynamic);
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0103 A[EDGE_INSN: B:70:0x0103->B:71:0x0104 BREAK  A[LOOP:0: B:21:0x0051->B:28:0x006d]] */
    public void B0(int i, String str, Dynamic dynamic) {
        int iV;
        com.google.android.exoplayer2.trackselection.c.a aVarG;
        int iT;
        if (this.h == null || (iV = V(i)) == -1 || (aVarG = this.i.g()) == null) {
            return;
        }
        TrackGroupArray trackGroupArrayE = aVarG.e(iV);
        int[] iArr = {0};
        if (TextUtils.isEmpty(str)) {
            str = "default";
        }
        DefaultTrackSelector.Parameters parametersD = this.i.v().g().l(iV, true).a();
        if (str.equals("disabled")) {
            this.i.M(parametersD);
            return;
        }
        if (str.equals("language")) {
            iT = 0;
            while (true) {
                if (iT >= trackGroupArrayE.f8078a) {
                    iT = -1;
                    break;
                }
                String str2 = trackGroupArrayE.a(iT).a(0).c;
                if (str2 != null && str2.equals(dynamic.asString())) {
                    break;
                } else {
                    iT++;
                }
            }
        } else if (str.equals("title")) {
            iT = 0;
            while (true) {
                if (iT >= trackGroupArrayE.f8078a) {
                    iT = -1;
                    break;
                }
                String str3 = trackGroupArrayE.a(iT).a(0).f7815a;
                if (str3 != null && str3.equals(dynamic.asString())) {
                    break;
                } else {
                    iT++;
                }
            }
        } else if (str.equals("index")) {
            if (dynamic.asInt() >= trackGroupArrayE.f8078a) {
                iT = -1;
                break;
            }
            iT = dynamic.asInt();
        } else if (str.equals("resolution")) {
            int iAsInt = dynamic.asInt();
            int i2 = -1;
            for (int i3 = 0; i3 < trackGroupArrayE.f8078a; i3++) {
                TrackGroup trackGroupA = trackGroupArrayE.a(i3);
                for (int i4 = 0; i4 < trackGroupA.f8076a; i4++) {
                    if (trackGroupA.a(i4).f7818r == iAsInt) {
                        iArr[0] = i4;
                        i2 = i3;
                        break;
                    }
                }
            }
            iT = i2;
        } else if (iV == 3 && wlq.f38110a > 18) {
            CaptioningManager captioningManager = (CaptioningManager) this.Q.getSystemService("captioning");
            if (captioningManager == null || !captioningManager.isEnabled()) {
                iT = -1;
                break;
            }
            iT = T(trackGroupArrayE);
        } else {
            if (iV != 1) {
                iT = -1;
                break;
            }
            iT = T(trackGroupArrayE);
        }
        if (iT == -1 && i == 2 && trackGroupArrayE.f8078a != 0) {
            TrackGroup trackGroupA2 = trackGroupArrayE.a(0);
            iArr = new int[trackGroupA2.f8076a];
            for (int i5 = 0; i5 < trackGroupA2.f8076a; i5++) {
                iArr[i5] = i5;
            }
            iT = 0;
        }
        if (iT == -1) {
            this.i.M(parametersD);
        } else {
            this.i.M(this.i.v().g().l(iV, false).m(iV, trackGroupArrayE, new DefaultTrackSelector.SelectionOverride(iT, iArr)).a());
        }
    }

    public void C0(String str, Dynamic dynamic) {
        this.F = str;
        this.G = dynamic;
        B0(2, str, dynamic);
    }

    public void D0(Uri uri, String str, Map<String, String> map) {
        if (uri != null) {
            Uri uri2 = this.A;
            boolean z = uri2 == null;
            boolean zEquals = uri.equals(uri2);
            this.A = uri;
            this.B = str;
            this.N = map;
            this.g = fp5.c(this.Q, U, map);
            if (z || zEquals) {
                return;
            }
            f0();
        }
    }

    public void E0(ReadableArray readableArray) {
        this.J = readableArray;
        f0();
    }

    public void F0(boolean z) {
        this.f.setUseTextureView(z);
    }

    public void G0(float f) {
        this.s = f;
        t tVar = this.h;
        if (tVar != null) {
            tVar.i1(f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0021  */
    public final void H0() {
        int playbackState;
        t tVar = this.h;
        if (tVar == null || (playbackState = tVar.getPlaybackState()) == 1) {
            X();
        } else if (playbackState == 2 || playbackState == 3) {
            if (!this.h.n()) {
                s0(true);
            }
        } else if (playbackState == 4) {
            X();
        }
        if (this.K) {
            return;
        }
        setKeepScreenOn(true);
    }

    public final void I0() {
        this.T.sendEmptyMessage(1);
    }

    public final void J() {
        if (this.h == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f15403b.setLayoutParams(layoutParams);
        int iIndexOfChild = indexOfChild(this.f15403b);
        if (iIndexOfChild != -1) {
            removeViewAt(iIndexOfChild);
        }
        addView(this.f15403b, 1, layoutParams);
    }

    public final void J0() {
        b0();
        e0();
    }

    public final void K() {
        w0(this.C);
    }

    public final void K0() {
        if (this.h == null) {
            return;
        }
        d0(this.f15403b);
        if (this.f15403b.J()) {
            this.f15403b.G();
        } else {
            this.f15403b.P();
        }
    }

    public final com.google.android.exoplayer2.upstream.a.InterfaceC0205a L(boolean z) {
        return fp5.c(this.Q, z ? U : null, this.N);
    }

    public final void L0() {
        this.f15404k = this.h.y();
        this.l = this.h.x() ? Math.max(0L, this.h.getCurrentPosition()) : -9223372036854775807L;
    }

    public final k M(Uri uri, String str) {
        String lastPathSegment;
        if (TextUtils.isEmpty(str)) {
            lastPathSegment = uri.getLastPathSegment();
        } else {
            lastPathSegment = "." + str;
        }
        int iK0 = wlq.k0(lastPathSegment);
        com.google.android.exoplayer2.upstream.a.InterfaceC0205a interfaceC0205aL = L(false);
        if (iK0 == 0) {
            DashMediaSource.Factory factory = new DashMediaSource.Factory(new com.google.android.exoplayer2.source.dash.c.a(this.g), interfaceC0205aL);
            factory.d(new f(this.t));
            factory.c(30000L);
            return factory.a(m.b(uri));
        }
        if (iK0 == 1) {
            SsMediaSource.Factory factory2 = new SsMediaSource.Factory(new com.google.android.exoplayer2.source.smoothstreaming.a.C0200a(this.g), interfaceC0205aL);
            factory2.d(new f(this.t));
            factory2.c(30000L);
            return factory2.a(m.b(uri));
        }
        if (iK0 == 2) {
            HlsMediaSource.Factory factory3 = new HlsMediaSource.Factory(interfaceC0205aL);
            factory3.d(new f(this.t));
            return factory3.a(m.b(uri));
        }
        if (iK0 == 4) {
            return new p.b(interfaceC0205aL, new yu5()).a(m.b(uri));
        }
        throw new IllegalStateException("Unsupported type: " + iK0);
    }

    public final void M0() {
        if (this.m) {
            this.m = false;
            z0(this.D, this.E);
            C0(this.F, this.G);
            A0(this.H, this.I);
            Format formatN0 = this.h.N0();
            this.f15402a.l(this.h.getDuration(), this.h.getCurrentPosition(), formatN0 != null ? formatN0.q : 0, formatN0 != null ? formatN0.f7818r : 0, S(), U(), W());
        }
    }

    public final k N(String str, Uri uri, String str2, String str3) {
        return new v.b(this.g).a(uri, Format.d(str, str2, -1, str3), -9223372036854775807L);
    }

    public final ArrayList<k> O() {
        ArrayList<k> arrayList = new ArrayList<>();
        if (this.J == null) {
            return arrayList;
        }
        for (int i = 0; i < this.J.size(); i++) {
            ReadableMap map = this.J.getMap(i);
            String string = map.getString("language");
            k kVarN = N(map.hasKey("title") ? map.getString("title") : string + " " + i, Uri.parse(map.getString(SportRecordBundleKey.BUNDLE_PARAM_URI)), map.getString("type"), string);
            if (kVarN != null) {
                arrayList.add(kVarN);
            }
        }
        return arrayList;
    }

    public void P() {
        J0();
    }

    public final void Q() {
        this.f15404k = -1;
        this.l = -9223372036854775807L;
    }

    public final void R() {
        Q();
        this.g = L(true);
        this.e = new Handler();
        CookieHandler cookieHandler = CookieHandler.getDefault();
        CookieManager cookieManager = V;
        if (cookieHandler != cookieManager) {
            CookieHandler.setDefault(cookieManager);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ExoPlayerView exoPlayerView = new ExoPlayerView(getContext());
        this.f = exoPlayerView;
        exoPlayerView.setLayoutParams(layoutParams);
        addView(this.f, 0, layoutParams);
    }

    public final WritableArray S() {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        com.google.android.exoplayer2.trackselection.c.a aVarG = this.i.g();
        int iV = V(1);
        if (aVarG != null && iV != -1) {
            TrackGroupArray trackGroupArrayE = aVarG.e(iV);
            for (int i = 0; i < trackGroupArrayE.f8078a; i++) {
                Format formatA = trackGroupArrayE.a(i).a(0);
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("index", i);
                String str = formatA.f7815a;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                writableMapCreateMap.putString("title", str);
                writableMapCreateMap.putString("type", formatA.l);
                String str3 = formatA.c;
                if (str3 == null) {
                    str3 = "";
                }
                writableMapCreateMap.putString("language", str3);
                int i2 = formatA.h;
                if (i2 != -1) {
                    str2 = String.format(Locale.US, "%.2fMbps", Float.valueOf(i2 / 1000000.0f));
                }
                writableMapCreateMap.putString("bitrate", str2);
                writableArrayCreateArray.pushMap(writableMapCreateMap);
            }
        }
        return writableArrayCreateArray;
    }

    public final int T(TrackGroupArray trackGroupArray) {
        if (trackGroupArray.f8078a == 0) {
            return -1;
        }
        String language = Locale.getDefault().getLanguage();
        String iSO3Language = Locale.getDefault().getISO3Language();
        for (int i = 0; i < trackGroupArray.f8078a; i++) {
            String str = trackGroupArray.a(i).a(0).c;
            if (str != null && (str.equals(language) || str.equals(iSO3Language))) {
                return i;
            }
        }
        return 0;
    }

    public final WritableArray U() {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        com.google.android.exoplayer2.trackselection.c.a aVarG = this.i.g();
        int iV = V(3);
        if (aVarG != null && iV != -1) {
            TrackGroupArray trackGroupArrayE = aVarG.e(iV);
            for (int i = 0; i < trackGroupArrayE.f8078a; i++) {
                Format formatA = trackGroupArrayE.a(i).a(0);
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("index", i);
                String str = formatA.f7815a;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                writableMapCreateMap.putString("title", str);
                writableMapCreateMap.putString("type", formatA.l);
                String str3 = formatA.c;
                if (str3 != null) {
                    str2 = str3;
                }
                writableMapCreateMap.putString("language", str2);
                writableArrayCreateArray.pushMap(writableMapCreateMap);
            }
        }
        return writableArrayCreateArray;
    }

    public int V(int i) {
        int iL0 = this.h.L0();
        for (int i2 = 0; i2 < iL0; i2++) {
            if (this.h.M0(i2) == i) {
                return i2;
            }
        }
        return -1;
    }

    public final WritableArray W() {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        com.google.android.exoplayer2.trackselection.c.a aVarG = this.i.g();
        int iV = V(2);
        if (aVarG != null && iV != -1) {
            TrackGroupArray trackGroupArrayE = aVarG.e(iV);
            for (int i = 0; i < trackGroupArrayE.f8078a; i++) {
                TrackGroup trackGroupA = trackGroupArrayE.a(i);
                for (int i2 = 0; i2 < trackGroupA.f8076a; i2++) {
                    Format formatA = trackGroupA.a(i2);
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    int i3 = formatA.q;
                    if (i3 == -1) {
                        i3 = 0;
                    }
                    writableMapCreateMap.putInt("width", i3);
                    int i4 = formatA.f7818r;
                    if (i4 == -1) {
                        i4 = 0;
                    }
                    writableMapCreateMap.putInt("height", i4);
                    int i5 = formatA.h;
                    if (i5 == -1) {
                        i5 = 0;
                    }
                    writableMapCreateMap.putInt("bitrate", i5);
                    String str = formatA.i;
                    if (str == null) {
                        str = "";
                    }
                    writableMapCreateMap.putString("codecs", str);
                    String strValueOf = formatA.f7815a;
                    if (strValueOf == null) {
                        strValueOf = String.valueOf(i2);
                    }
                    writableMapCreateMap.putString("trackId", strValueOf);
                    writableArrayCreateArray.pushMap(writableMapCreateMap);
                }
            }
        }
        return writableArrayCreateArray;
    }

    public final void X() {
        new Handler().postDelayed(new d(this), 1L);
    }

    public final void Y() {
        if (this.f15403b == null) {
            this.f15403b = new PlayerControlView(getContext());
        }
        this.f15403b.setPlayer(this.h);
        this.f15403b.P();
        this.c = this.f15403b.findViewById(lsi.f25400a);
        this.f.setOnClickListener(new b());
        c cVar = new c();
        this.d = cVar;
        this.h.t(cVar);
    }

    @Override // defpackage.zh2
    public void a() {
        this.f15402a.a();
    }

    public final void a0(boolean z) {
        if (this.q == z) {
            return;
        }
        this.q = z;
        if (z) {
            this.f15402a.d(true);
        } else {
            this.f15402a.d(false);
        }
    }

    public final void b0() {
        if (this.n) {
            l0(false);
        }
        setKeepScreenOn(false);
        this.R.abandonAudioFocus(this);
    }

    public final void c0() {
        t tVar = this.h;
        if (tVar != null && tVar.n()) {
            s0(false);
        }
        setKeepScreenOn(false);
    }

    @Override // gy1.a
    public void d(int i, long j, long j2) {
        if (this.O) {
            this.f15402a.c(j2);
        }
    }

    public final void d0(View view) {
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        view.layout(view.getLeft(), view.getTop(), view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public final void e0() {
        if (this.h != null) {
            L0();
            this.h.release();
            this.h.V0(this);
            this.i = null;
            this.h = null;
        }
        this.T.removeMessages(1);
        this.Q.removeLifecycleEventListener(this);
        this.S.a();
        U.e(this);
    }

    public final void f0() {
        this.j = true;
        X();
    }

    public final boolean g0() {
        return this.K || this.A == null || this.R.requestAudioFocus(this, 3, 1) == 1;
    }

    public void h0(long j) {
        t tVar = this.h;
        if (tVar != null) {
            this.v = j;
            tVar.seekTo(j);
        }
    }

    public void i0(int i, int i2, int i3, int i4) {
        this.w = i;
        this.x = i2;
        this.y = i3;
        this.z = i4;
        e0();
        X();
    }

    public void j0(boolean z) {
        this.P = z;
        if (this.h == null || this.f == null) {
            return;
        }
        if (z) {
            J();
            return;
        }
        int iIndexOfChild = indexOfChild(this.f15403b);
        if (iIndexOfChild != -1) {
            removeViewAt(iIndexOfChild);
        }
    }

    public void k0(boolean z) {
        this.K = z;
    }

    public void l0(boolean z) {
        if (z == this.n) {
            return;
        }
        this.n = z;
        Activity currentActivity = this.Q.getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        View decorView = currentActivity.getWindow().getDecorView();
        if (!this.n) {
            this.f15402a.i();
            decorView.setSystemUiVisibility(0);
            this.f15402a.g();
        } else {
            int i = wlq.f38110a >= 19 ? DKFRequestService.w0 : 6;
            this.f15402a.j();
            decorView.setSystemUiVisibility(i);
            this.f15402a.h();
        }
    }

    public void m0(boolean z) {
        this.f.setHideShutterView(z);
    }

    public void n0(int i) {
        this.u = i;
        if (this.h != null) {
            DefaultTrackSelector defaultTrackSelector = this.i;
            DefaultTrackSelector.d dVarO = defaultTrackSelector.o();
            int i2 = this.u;
            if (i2 == 0) {
                i2 = Integer.MAX_VALUE;
            }
            defaultTrackSelector.N(dVarO.h(i2));
        }
    }

    public void o0(int i) {
        this.t = i;
        e0();
        X();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        X();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i) {
        if (i == -1) {
            this.f15402a.b(false);
        } else if (i == 1) {
            this.f15402a.b(true);
        }
        t tVar = this.h;
        if (tVar != null) {
            if (i == -3) {
                tVar.i1(this.s * 0.8f);
            } else if (i == 1) {
                tVar.i1(this.s * 1.0f);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        J0();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.o = true;
        if (this.M) {
            return;
        }
        s0(false);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        if (!this.M || !this.o) {
            s0(!this.p);
        }
        this.o = false;
    }

    @Override // com.google.android.exoplayer2.q.c
    public void onLoadingChanged(boolean z) {
    }

    @Override // defpackage.stf
    public void onMetadata(Metadata metadata) {
        this.f15402a.t(metadata);
    }

    @Override // com.google.android.exoplayer2.q.c
    public void onPlaybackParametersChanged(n0i n0iVar) {
        this.f15402a.n(n0iVar.f27406a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0073  */
    /* JADX WARN: Code duplicated, block: B:23:0x0080  */
    /* JADX WARN: Code duplicated, block: B:24:0x0087  */
    @Override // com.google.android.exoplayer2.q.c
    public void onPlayerError(ExoPlaybackException exoPlaybackException) {
        Exception sourceException;
        int i = exoPlaybackException.type;
        String string = null;
        if (i != 1) {
            if (i == 0) {
                sourceException = exoPlaybackException.getSourceException();
                string = getResources().getString(s1j.e);
            }
            if (string != null) {
                this.f15402a.f(string, sourceException);
            }
            this.j = true;
            if (Z(exoPlaybackException)) {
                L0();
            } else {
                Q();
                X();
            }
        }
        Exception rendererException = exoPlaybackException.getRendererException();
        if (rendererException instanceof MediaCodecRenderer.DecoderInitializationException) {
            MediaCodecRenderer.DecoderInitializationException decoderInitializationException = (MediaCodecRenderer.DecoderInitializationException) rendererException;
            if (decoderInitializationException.codecInfo != null) {
                string = getResources().getString(s1j.f33170a, decoderInitializationException.codecInfo.f7979a);
            } else if (decoderInitializationException.getCause() instanceof MediaCodecUtil.DecoderQueryException) {
                string = getResources().getString(s1j.d);
            } else {
                string = decoderInitializationException.secureDecoderRequired ? getResources().getString(s1j.c, decoderInitializationException.mimeType) : getResources().getString(s1j.f33171b, decoderInitializationException.mimeType);
            }
        }
        sourceException = exoPlaybackException;
        if (string != null) {
            this.f15402a.f(string, sourceException);
        }
        this.j = true;
        if (Z(exoPlaybackException)) {
            L0();
        } else {
            Q();
            X();
        }
    }

    @Override // com.google.android.exoplayer2.q.c
    public void onPlayerStateChanged(boolean z, int i) {
        String str = "onStateChanged: playWhenReady=" + z + ", playbackState=";
        if (i == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("idle");
            this.f15402a.k();
            return;
        }
        if (i == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("buffering");
            a0(true);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append("unknown");
                return;
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append("ended");
                this.f15402a.e();
                b0();
                return;
            }
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(str);
        sb5.append("ready");
        this.f15402a.p();
        a0(false);
        I0();
        M0();
        PlayerControlView playerControlView = this.f15403b;
        if (playerControlView != null) {
            playerControlView.P();
        }
    }

    @Override // com.google.android.exoplayer2.q.c
    public void onPositionDiscontinuity(int i) {
        if (this.j) {
            L0();
        }
        if (i == 0 && this.h.getRepeatMode() == 1) {
            this.f15402a.e();
        }
    }

    @Override // com.google.android.exoplayer2.q.c
    public void onRepeatModeChanged(int i) {
    }

    @Override // com.google.android.exoplayer2.q.c
    public void onSeekProcessed() {
        this.f15402a.r(this.h.getCurrentPosition(), this.v);
        this.v = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.q.c
    public void onShuffleModeEnabledChanged(boolean z) {
    }

    @Override // com.google.android.exoplayer2.q.c
    public void onTimelineChanged(com.google.android.exoplayer2.v vVar, Object obj, int i) {
    }

    @Override // com.google.android.exoplayer2.q.c
    public void onTracksChanged(TrackGroupArray trackGroupArray, aop aopVar) {
    }

    public void p0(boolean z) {
        float f = z ? 0.0f : 1.0f;
        this.s = f;
        t tVar = this.h;
        if (tVar != null) {
            tVar.i1(f);
        }
    }

    public void q0(boolean z) {
        this.p = z;
        if (this.h != null) {
            if (z) {
                c0();
            } else {
                H0();
            }
        }
    }

    public void r0(boolean z) {
        this.M = z;
    }

    public final void s0(boolean z) {
        t tVar = this.h;
        if (tVar == null) {
            return;
        }
        if (!z) {
            tVar.z(false);
        } else if (g0()) {
            this.h.z(true);
        }
    }

    @Override // android.view.View
    public void setId(int i) {
        super.setId(i);
        this.f15402a.s(i);
    }

    public void t0(float f) {
        this.L = f;
    }

    public void u0(float f) {
        this.f15405r = f;
        if (this.h != null) {
            this.h.d(new n0i(this.f15405r, 1.0f));
        }
    }

    public void v0(Uri uri, String str) {
        if (uri != null) {
            Uri uri2 = this.A;
            boolean z = uri2 == null;
            boolean zEquals = uri.equals(uri2);
            this.A = uri;
            this.B = str;
            this.g = L(true);
            if (z || zEquals) {
                return;
            }
            f0();
        }
    }

    public void w0(boolean z) {
        t tVar = this.h;
        if (tVar != null) {
            if (z) {
                tVar.setRepeatMode(1);
            } else {
                tVar.setRepeatMode(0);
            }
        }
        this.C = z;
    }

    public void x0(boolean z) {
        this.O = z;
    }

    public void y0(int i) {
        this.f.setResizeMode(i);
    }

    public void z0(String str, Dynamic dynamic) {
        this.D = str;
        this.E = dynamic;
        B0(1, str, dynamic);
    }
}
