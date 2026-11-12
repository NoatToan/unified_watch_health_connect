package ot;

import android.content.Context;
import android.graphics.Bitmap;
import ch.qos.logback.core.CoreConstants;
import com.airbnb.lottie.LottieDrawable;
import com.garmin.android.apps.connectmobile.R;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lot/r;", "Lot/p;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ltt/n;", "coverPageData", "Lot/x;", "responsiveScreenInfo", "<init>", "(Landroid/content/Context;Ltt/n;Lot/x;)V", "a", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r extends p {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final tt.n f133665n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f133666o;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.annual_report.chapter.IntroPlayable$handleLottieDrawable$1", f = "IntroPlayable.kt", l = {59}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f133667a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f133669c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ LottieDrawable f133670d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, LottieDrawable lottieDrawable, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f133669c = context;
            this.f133670d = lottieDrawable;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return r.this.new b(this.f133669c, this.f133670d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f133667a;
            if (i14 == 0) {
                o13.r.b(obj);
                tt.n nVar = r.this.f133665n;
                if (nVar != null) {
                    this.f133667a = 1;
                    obj = st.b.a(nVar, this.f133669c, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                LottieDrawable lottieDrawable = this.f133670d;
                if ((lottieDrawable != null ? lottieDrawable.getComposition() : null) != null) {
                    lottieDrawable.updateBitmap("image_0", Bitmap.createScaledBitmap(bitmap, 298, 298, true));
                }
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, tt.n nVar, x xVar) {
        super(context, xVar);
        context.getClass();
        xVar.getClass();
        this.f133665n = nVar;
        this.f133666o = "IntroPlayable";
    }

    @Override // ot.p
    public final StringBuilder d(Context context) throws IOException {
        pt.i iVar = pt.i.f140571a;
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(R.raw.intro);
        inputStreamOpenRawResource.getClass();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, d53.c.f57666b), 8192);
        try {
            String strE = lg.d.E(bufferedReader);
            bufferedReader.close();
            return new StringBuilder(strE);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                jg.b.l(bufferedReader, th3);
                throw th4;
            }
        }
    }

    @Override // ot.p
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getF133677s() {
        return this.f133666o;
    }

    @Override // ot.p
    /* JADX INFO: renamed from: g */
    public final String getF133658l() {
        return "images/intro";
    }

    /* JADX WARN: Code duplicated, block: B:118:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:139:0x0321  */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    @Override // ot.p
    public final com.airbnb.lottie.LottieComposition h(android.content.Context r28, o13.p<java.lang.Integer, java.lang.Integer> r29, o13.p<java.lang.Integer, java.lang.Integer> r30, int r31) {
        /*
            Method dump skipped, instruction units count: 907
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ot.r.h(android.content.Context, o13.p, o13.p, int):com.airbnb.lottie.LottieComposition");
    }

    @Override // ot.p
    public final void i(Context context, LottieDrawable lottieDrawable) {
        x53.c cVar = s0.f129406a;
        ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new b(context, lottieDrawable, null), 3);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lot/r$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "MAX_CAPSULE_WIDTH_ANIMATION_RATIO", "F", "NM_DISPLAY_NAME_TEXT", "NM_DISPLAY_NAME_CAPSULE", "NM_RUNDOWN", "AVATAR_IMAGE_ID", "", "INTRO_PROFILE_IMAGE_SIZE", "I", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
