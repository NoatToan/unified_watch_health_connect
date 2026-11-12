package ch1;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\bB\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lch1/j2;", "Lch1/a5;", "Lvk1/f;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j2 extends a5<vk1.f, Integer> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f27387h = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xg1.b f27390g;

    static {
        new a(null);
    }

    public j2(Context context) {
        super(context);
        xg1.b bVar = new xg1.b(this.f70343a);
        this.f27390g = bVar;
        bVar.f190877c = Math.max(46, 30);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        ((vk1.f) obj).getClass();
        return true;
    }

    @Override // ch1.a5
    public final int r() {
        return 2;
    }

    @Override // ch1.a5
    public final Integer s(vk1.f fVar) {
        vk1.f fVar2 = fVar;
        fVar2.getClass();
        return Integer.valueOf(fVar2.f178614d);
    }

    @Override // ch1.a5
    public final int t() {
        return View.generateViewId();
    }

    @Override // ch1.a5
    public final String u() {
        String strB = b(R.string.hr_zones_lbl_lactate_threshold);
        strB.getClass();
        return strB;
    }

    @Override // ch1.a5
    public final xg1.c<Integer> v(vk1.f fVar) {
        vk1.f fVar2 = fVar;
        fVar2.getClass();
        return new a0.h(14, this, fVar2);
    }

    @Override // ch1.a5
    public final xg1.r<Integer> w() {
        return this.f27390g;
    }

    @Override // ch1.a5
    public final void x(Integer num, vk1.f fVar) {
        Integer num2 = num;
        vk1.f fVar2 = fVar;
        fVar2.getClass();
        if (num2 != null) {
            if (num2.intValue() >= this.f27388e && num2.intValue() <= this.f27389f) {
                vk1.a.a(fVar2, num2.intValue());
                return;
            }
            com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.SETTINGS;
            StringBuilder sbJ = i3.e5.j(this.f27388e, this.f27389f, "Value out of range (", ", ", ") ");
            sbJ.append(num2);
            String string = sbJ.toString();
            aVar.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "LactateHRField", string);
        }
    }

    @Override // ch1.a5, fb2.e
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final boolean k(vk1.f fVar) {
        fVar.getClass();
        this.f27389f = fVar.f178621k - 1;
        this.f27388e = (int) Math.max(fVar.f178613c + 1, 46.0d);
        int i14 = this.f27389f;
        xg1.b bVar = this.f27390g;
        bVar.getClass();
        bVar.f190878d = Math.min(i14, 250);
        bVar.f190877c = Math.max(this.f27388e, 30);
        return super.k(fVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lch1/j2$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
