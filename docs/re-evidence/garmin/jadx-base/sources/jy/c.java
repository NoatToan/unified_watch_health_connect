package jy;

import android.content.Context;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.format.DateUtils;
import android.text.format.Time;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.calendar.presentation.d;
import com.roomorama.caldroid.CaldroidGridAdapter;
import ey.v;
import java.util.Formatter;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Ljy/c;", "Lfe/a;", "Landroid/content/Context;", "mContext", "adapter", "<init>", "(Landroid/content/Context;Lfe/a;)V", "a", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends fe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f101666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fe.a f101667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StringBuilder f101668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Formatter f101669d;

    static {
        new a(null);
    }

    public c(Context context, fe.a aVar) {
        context.getClass();
        aVar.getClass();
        this.f101666a = context;
        this.f101667b = aVar;
        StringBuilder sb3 = new StringBuilder(50);
        this.f101668c = sb3;
        this.f101669d = new Formatter(sb3, Locale.getDefault());
    }

    @Override // fe.a
    public final void destroyItem(ViewGroup viewGroup, int i14, Object obj) {
        viewGroup.getClass();
        obj.getClass();
        fe.a aVar = this.f101667b;
        aVar.destroyItem(viewGroup, i14 % aVar.getF149591t(), obj);
    }

    @Override // fe.a
    public final void finishUpdate(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.f101667b.finishUpdate(viewGroup);
    }

    @Override // fe.a
    /* JADX INFO: renamed from: getCount */
    public final int getF149591t() {
        return Integer.MAX_VALUE;
    }

    @Override // fe.a
    public final CharSequence getPageTitle(int i14) {
        Context context = this.f101666a;
        fe.a aVar = this.f101667b;
        try {
            CaldroidGridAdapter caldroidGridAdapter = ((com.garmin.android.apps.connectmobile.calendar.presentation.c) ((v) aVar).getItem(i14 % aVar.getF149591t())).f31141c;
            caldroidGridAdapter.getClass();
            d dVar = (d) caldroidGridAdapter;
            int iF = dVar.f();
            int iG = dVar.g();
            Time time = new Time();
            time.year = iG;
            time.month = iF - 1;
            time.monthDay = 1;
            long millis = time.toMillis(true);
            this.f101668c.setLength(0);
            String string = DateUtils.formatDateRange(this.f101666a, this.f101669d, millis, millis, 52).toString();
            string.getClass();
            SpannableString spannableString = new SpannableString(string);
            spannableString.setSpan(new AbsoluteSizeSpan((int) c22.b.b(context, context.getResources().getDimensionPixelSize(R.dimen.andfont_body_1), 1.3f)), 0, string.length(), 18);
            return spannableString;
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // fe.a
    public final Object instantiateItem(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        fe.a aVar = this.f101667b;
        Object objInstantiateItem = aVar.instantiateItem(viewGroup, i14 % aVar.getF149591t());
        objInstantiateItem.getClass();
        return objInstantiateItem;
    }

    @Override // fe.a
    public final boolean isViewFromObject(View view2, Object obj) {
        view2.getClass();
        obj.getClass();
        return this.f101667b.isViewFromObject(view2, obj);
    }

    @Override // fe.a
    public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        this.f101667b.restoreState(parcelable, classLoader);
    }

    @Override // fe.a
    public final Parcelable saveState() {
        return this.f101667b.saveState();
    }

    @Override // fe.a
    public final void startUpdate(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.f101667b.startUpdate(viewGroup);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljy/c$a;", "", "<init>", "()V", "", "MONTH_YEAR_FLAG", "I", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
