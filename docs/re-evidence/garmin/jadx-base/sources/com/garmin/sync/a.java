package com.garmin.sync;

import e23.p;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
@e(c = "com.garmin.sync.UploadConfigurationLoader$fetchFromServer$2", f = "UploadConfigurationLoader.kt", l = {385}, m = "invokeSuspend")
public final class a extends i implements p<b0, d<? super String>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f52800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public UploadConfigurationLoader f52801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f52802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f52803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f52804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f52805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f52806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ UploadConfigurationLoader f52807h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f52808i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f52809j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(UploadConfigurationLoader uploadConfigurationLoader, long j8, boolean z14, d<? super a> dVar) {
        super(2, dVar);
        this.f52807h = uploadConfigurationLoader;
        this.f52808i = j8;
        this.f52809j = z14;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new a(this.f52807h, this.f52808i, this.f52809j, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super String> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x010e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0114  */
    /* JADX WARN: Code duplicated, block: B:51:0x0133 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:58:0x0172  */
    /* JADX WARN: Code duplicated, block: B:60:0x017a A[Catch: Exception -> 0x016f, TRY_ENTER, TryCatch #0 {Exception -> 0x016f, blocks: (B:54:0x0158, B:60:0x017a, B:65:0x01ce, B:67:0x021a, B:68:0x0232), top: B:79:0x0158 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:68:0x0232 A[Catch: Exception -> 0x016f, TRY_LEAVE, TryCatch #0 {Exception -> 0x016f, blocks: (B:54:0x0158, B:60:0x017a, B:65:0x01ce, B:67:0x021a, B:68:0x0232), top: B:79:0x0158 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x02b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:74:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:84:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 723
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.garmin.sync.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
