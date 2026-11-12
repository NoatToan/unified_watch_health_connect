package bi2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lbi2/y;", "Lbi2/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lei2/h;", "transform", "Lii2/b;", "settingsViewModel", "", "", "", "attributeMap", "<init>", "(Landroid/content/Context;Lei2/h;Lii2/b;Ljava/util/Map;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class y extends f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Map<String, Object> f18285o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hi2.d f18286p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f18287q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f18288r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f18289s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f18290t;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @v13.e(c = "com.garmin.androiddynamicsettings.app.onclickviews.HydrationDailyGoalDialog", f = "HydrationDailyGoalDialog.kt", l = {58}, m = "getUnitsString")
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f18291a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18293c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f18291a = obj;
            this.f18293c |= Integer.MIN_VALUE;
            return y.this.e(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Context context, ei2.h hVar, ii2.b bVar, Map<String, ? extends Object> map) {
        super(context, hVar, bVar, map);
        context.getClass();
        hVar.getClass();
        bVar.getClass();
        map.getClass();
        this.f18285o = map;
        this.f18286p = new hi2.d("HydrationDailyGoalDialog", hi2.e.HYDRATION.f83902a);
        this.f18287q = 1;
        this.f18288r = 5000;
        this.f18289s = 500;
        this.f18290t = true;
    }

    @Override // bi2.f
    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF18289s() {
        return this.f18289s;
    }

    @Override // bi2.f
    /* JADX INFO: renamed from: b, reason: from getter */
    public final hi2.d getF18286p() {
        return this.f18286p;
    }

    @Override // bi2.f
    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getF18288r() {
        return this.f18288r;
    }

    @Override // bi2.f
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getF18287q() {
        return this.f18287q;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // bi2.f
    public final Object e(t13.d<? super String> dVar) {
        a aVar;
        Object obj;
        String string;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f18293c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f18293c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objI = aVar.f18291a;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f18293c;
        if (i15 == 0) {
            o13.r.b(objI);
            aVar.f18293c = 1;
            objI = this.f18137b.i(this.f18138c, this.f18285o, 0);
            if (objI == obj2) {
                return obj2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objI);
        }
        HashMap map = (HashMap) objI;
        return (map == null || (obj = map.get(mh2.i.DS_SELECTED_UNIT.f118617a)) == null || (string = obj.toString()) == null) ? "" : string;
    }

    @Override // bi2.f
    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getF18290t() {
        return this.f18290t;
    }

    @Override // bi2.f
    public final String h() {
        x0 x0Var = x0.f105818a;
        Context context = this.f18136a;
        String string = context.getString(R.string.settings_popup_error_message_format);
        string.getClass();
        return String.format(string, Arrays.copyOf(new Object[]{context.getString(R.string.lbl_goal), String.valueOf(this.f18287q - 1), String.valueOf(this.f18288r + 1)}, 3));
    }

    @Override // bi2.f
    public final void j() {
        this.f18142g.setText(this.f18136a.getString(R.string.lbl_daily_goal));
    }

    @Override // bi2.f
    public final void k() {
        this.f18143h.setVisibility(0);
    }
}
