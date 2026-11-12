package ot;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.TextDelegate;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Map;
import p005kotlin.Metadata;
import p13.k0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001:\u0002\b\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lot/l;", "Lot/p;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lot/x;", "responsiveScreenInfo", "<init>", "(Landroid/content/Context;Lot/x;)V", "a", "b", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class l extends p {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f133614q = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f133615n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f133616o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k0 f133617p;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lot/l$a;", "", "Lcom/airbnb/lottie/LottieDrawable;", "lottieDrawable", "", "fileName", "<init>", "(Lot/l;Lcom/airbnb/lottie/LottieDrawable;Ljava/lang/String;)V", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LottieDrawable f133618a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f133619b;

        public a(l lVar, LottieDrawable lottieDrawable, String str) {
            lottieDrawable.getClass();
            str.getClass();
            this.f133618a = lottieDrawable;
            this.f133619b = str;
        }
    }

    static {
        new b(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, x xVar) {
        super(context, xVar);
        context.getClass();
        xVar.getClass();
        this.f133616o = new ArrayList();
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        this.f133617p = k0Var;
    }

    public abstract tt.m j();

    public final JsonObject k(Context context, bu.g gVar, String str) {
        context.getClass();
        try {
            bu.f.f21180a.getClass();
            return (JsonObject) new Gson().fromJson(bu.f.e(context, gVar, str), JsonObject.class);
        } catch (Exception e4) {
            String strJ = androidx.room.a0.j("getShareImageAnimationJsonObject ", getClass().getSimpleName(), " has exception = ", e4.getMessage());
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "AnnualReportChapter", strJ);
            nt.a aVar2 = nt.a.f127827a;
            String strF = f();
            aVar2.getClass();
            strF.getClass();
            ht.s sVar = ht.s.f85508a;
            lt.a.e eVar = new lt.a.e(strF, lt.a.d.CHAPTER_SHARE_IMAGE_FAILED);
            sVar.getClass();
            ht.s.a(eVar);
            return null;
        }
    }

    public Map<String, String> l() {
        return this.f133617p;
    }

    public abstract Object m(Context context, yt.o oVar);

    public abstract boolean n();

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    /* JADX WARN: Code duplicated, block: B:31:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x005c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0041 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0096 -> B:28:0x0098). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:35:0x0041
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object o(android.content.Context r13, java.util.List r14, v13.c r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof ot.m
            if (r0 == 0) goto L13
            r0 = r15
            ot.m r0 = (ot.m) r0
            int r1 = r0.f133626g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f133626g = r1
            goto L18
        L13:
            ot.m r0 = new ot.m
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.f133624e
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r0.f133626g
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 != r4) goto L31
            int r13 = r0.f133623d
            java.lang.String r14 = r0.f133622c
            java.util.Iterator r2 = r0.f133621b
            android.content.Context r6 = r0.f133620a
            o13.r.b(r15)
            goto L98
        L31:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r13)
            return r5
        L37:
            o13.r.b(r15)
            java.util.Iterator r14 = r14.iterator()
            r8 = r13
            r2 = r14
            r13 = r3
        L41:
            boolean r14 = r2.hasNext()
            if (r14 == 0) goto L9f
            java.lang.Object r14 = r2.next()
            ot.l$a r14 = (ot.l.a) r14
            com.airbnb.lottie.LottieDrawable r15 = r14.f133618a
            java.lang.String r10 = r14.f133619b
            r14 = 1065353216(0x3f800000, float:1.0)
            r15.setProgress(r14)
            int r14 = r15.getIntrinsicWidth()
            if (r14 <= 0) goto L41
            int r14 = r15.getIntrinsicHeight()
            if (r14 <= 0) goto L41
            r14 = 7
            android.graphics.Bitmap r9 = d7.b.b(r15, r3, r3, r14)
            java.lang.Class<xt.a> r14 = xt.a.class
            r15 = 6
            java.lang.Object r14 = org.koin.java.KoinJavaComponent.get$default(r14, r5, r5, r15, r5)
            r7 = r14
            xt.a r7 = (xt.a) r7
            r0.f133620a = r8
            r0.f133621b = r2
            r0.f133622c = r10
            r0.f133623d = r13
            r0.f133626g = r4
            r7.getClass()
            x53.c r14 = o53.s0.f129406a
            x53.b r14 = x53.b.f189152a
            xt.h r6 = new xt.h
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            java.lang.Object r14 = ge1.b.e0(r14, r6, r0)
            u13.a r15 = u13.a.COROUTINE_SUSPENDED
            if (r14 != r15) goto L91
            goto L93
        L91:
            kotlin.Unit r14 = p005kotlin.Unit.INSTANCE
        L93:
            if (r14 != r1) goto L96
            return r1
        L96:
            r6 = r8
            r14 = r10
        L98:
            java.util.ArrayList r15 = r12.f133616o
            r15.add(r14)
            r8 = r6
            goto L41
        L9f:
            r12.f133615n = r4
            java.lang.Class r13 = r12.getClass()
            java.lang.String r13 = r13.getSimpleName()
            java.lang.String r14 = "chapter = "
            java.lang.String r15 = " finish the saveSharedImage"
            java.lang.String r13 = am.j.m(r14, r13, r15)
            com.garmin.android.apps.connectmobile.i2$a r14 = com.garmin.android.apps.connectmobile.i2.f36769a
            com.garmin.android.apps.connectmobile.a2 r15 = com.garmin.android.apps.connectmobile.a2.GENERAL
            r14.getClass()
            java.lang.String r14 = "AnnualReportChapter"
            com.garmin.android.apps.connectmobile.i2.a.b(r15, r14, r13)
            kotlin.Unit r13 = p005kotlin.Unit.INSTANCE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ot.l.o(android.content.Context, java.util.List, v13.c):java.lang.Object");
    }

    public final void p(Context context, LottieDrawable lottieDrawable, Map<String, String> map) {
        context.getClass();
        map.getClass();
        map.forEach(new a73.l(new mw1.b(context, 18, this, lottieDrawable), 4));
    }

    public final void q(Context context, JsonObject jsonObject, LottieDrawable lottieDrawable) {
        context.getClass();
        String strM = am.j.m("chapter = ", getClass().getName(), " setupShareImageLottieDrawable");
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "AnnualReportChapter", strM);
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        lottieDrawable.setImagesAssetsFolder(getF133658l());
        lottieDrawable.setCallback(lottieAnimationView);
        lottieDrawable.setTextDelegate(new TextDelegate(lottieAnimationView));
        byte[] bytes = String.valueOf(jsonObject).getBytes(d53.c.f57666b);
        bytes.getClass();
        lottieDrawable.setComposition(LottieCompositionFactory.fromJsonInputStreamSync(new ByteArrayInputStream(bytes), null).getValue());
        p(context, lottieDrawable, l());
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lot/l$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
