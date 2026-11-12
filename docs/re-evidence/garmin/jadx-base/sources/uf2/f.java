package uf2;

import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.gfdi.protobuf.ProtobufException;
import com.garmin.proto.generated.GDIDataTypes;
import com.garmin.proto.generated.GDILiveSessionProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.List;
import java.util.UUID;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.LSVSessionStartInteractor", f = "LSVSessionStartInteractor.kt", l = {145, 146, ModuleDescriptor.MODULE_VERSION, 166, SyslogConstants.LOG_LOCAL6, 186, 196, 224, PsExtractor.VIDEO_STREAM_MASK, 264, 268, 275, 294, 326, 327, 331}, m = "handleLiveActivityStartRequest$live_session_view", v = 2)
public final class f extends v13.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ d B;
    public int C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GDILiveSessionProto.ActivityStartRequest f170332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rs2.c f170333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public dt2.g f170334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public fg2.d f170335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public UUID f170336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f170337f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public zf2.d f170338g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f170339h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f170340i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public GDIDataTypes.UUID f170341j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public rf2.l f170342k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f170343l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public zf2.f f170344m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public zf2.g f170345n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f170346o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public vf2.p f170347p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public GDISmartProto.Smart f170348q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ProtobufException f170349r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f170350t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f170351v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f170352w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f170353x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f170354y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f170355z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, t13.d<? super f> dVar2) {
        super(dVar2);
        this.B = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.c(null, null, null, 0, null, this);
    }
}
