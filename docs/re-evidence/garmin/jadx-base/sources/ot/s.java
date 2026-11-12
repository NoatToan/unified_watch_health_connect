package ot;

import android.content.Context;
import android.text.TextPaint;
import ch.qos.logback.core.CoreConstants;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.Marker;
import com.garmin.android.apps.connectmobile.R;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lot/s;", "Lot/p;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lot/x;", "responsiveScreenInfo", "<init>", "(Landroid/content/Context;Lot/x;)V", "a", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s extends p {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f133671n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f133672o;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, x xVar) {
        super(context, xVar);
        context.getClass();
        xVar.getClass();
        this.f133671n = "LoadingPlayable";
        this.f133672o = "images/loading";
    }

    @Override // ot.p
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getF133666o() {
        return this.f133671n;
    }

    @Override // ot.p
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getF133658l() {
        return this.f133672o;
    }

    @Override // ot.p
    public final LottieComposition h(Context context, o13.p<Integer, Integer> pVar, o13.p<Integer, Integer> pVar2, int i14) {
        return LottieCompositionFactory.fromRawResSync(context, R.raw.loading, null).getValue();
    }

    @Override // ot.p
    public final void i(Context context, LottieDrawable lottieDrawable) {
        Object next;
        if (lottieDrawable != null) {
            lottieDrawable.setRepeatCount(-1);
        }
        pt.h hVar = pt.h.f140570a;
        String string = context.getString(R.string.annual_report_loading_preparing);
        string.getClass();
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(16.0f);
        textPaint.setTypeface(oe2.f.P(context));
        Unit unit = Unit.INSTANCE;
        hVar.getClass();
        pt.v vVarG = pt.h.g(string, 310.0f, textPaint);
        pt.i iVar = pt.i.f140571a;
        String str = vVarG.f140606a;
        iVar.getClass();
        pt.i.d(lottieDrawable, "Preparing your Rundown", str);
        String string2 = context.getString(R.string.annual_report_loading_ready);
        string2.getClass();
        pt.i.d(lottieDrawable, "Here WE GO!", string2);
        Iterator it = this.f133650d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p005kotlin.jvm.internal.s.g(((Marker) next).getName(), "ready"));
        Marker marker = (Marker) next;
        if (marker != null) {
            a(lottieDrawable, p13.w.c(marker));
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lot/s$a;", "", "<init>", "()V", "", "LOADING_READY_MARKER_NAME", "Ljava/lang/String;", "LOADING_PREPARING_RUNDOWN_NAME", "LOADING_HERE_WE_GO_NAME", "", "PREPARING_TEXT_SPECIAL_WIDTH", "F", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
