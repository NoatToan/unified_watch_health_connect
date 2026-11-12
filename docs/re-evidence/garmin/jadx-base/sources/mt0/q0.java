package mt0;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lmt0/q0;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lmt0/y0;", "Landroid/app/Activity;", "mContext", "", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/j;", "mChallengePlayerDTOs", "", "mCurrentUserDisplayName", "<init>", "(Landroid/app/Activity;Ljava/util/List;Ljava/lang/String;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q0 extends RecyclerView.h<y0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f120816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<com.garmin.android.apps.connectmobile.leaderboard.model.j> f120817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kt0.a f120819d;

    public q0(Activity activity, List<com.garmin.android.apps.connectmobile.leaderboard.model.j> list, String str) {
        activity.getClass();
        list.getClass();
        str.getClass();
        this.f120816a = activity;
        this.f120817b = list;
        this.f120818c = str;
        this.f120819d = (kt0.a) KoinJavaComponent.get$default(kt0.a.class, null, null, 6, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f120817b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        y0 y0Var = (y0) f0Var;
        y0Var.getClass();
        TextView textView = y0Var.f120931c;
        TextView textView2 = y0Var.f120932d;
        com.garmin.android.apps.connectmobile.leaderboard.model.j jVar = this.f120817b.get(i14);
        View view2 = y0Var.f120929a;
        view2.setOnClickListener(new lq.g(7, this, jVar));
        String str = jVar.f38211b;
        Activity activity = this.f120816a;
        if (str == null || !str.equals(this.f120818c)) {
            textView.setTypeface(textView.getTypeface(), 0);
            textView2.setTypeface(textView2.getTypeface(), 0);
            textView2.setTextColor(a7.b.getColor(activity, R.color.gcm_text_secondary));
            view2.setBackgroundResource(R.drawable.gcm_surface_1_selector_background);
        } else {
            textView.setTypeface(textView.getTypeface(), 1);
            textView2.setTypeface(textView2.getTypeface(), 1);
            textView2.setTextColor(a7.b.getColor(activity, R.color.gcm_text_primary));
            view2.setBackgroundResource(R.drawable.gcm3_highlighted_list_item_selector);
        }
        TextView textView3 = y0Var.f120930b;
        p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
        Locale locale = Locale.getDefault();
        String string = activity.getString(R.string.format_decimal_value);
        string.getClass();
        textView3.setText(String.format(locale, string, Arrays.copyOf(new Object[]{Integer.valueOf(jVar.f38217h)}, 1)));
        y0Var.f120934f.setProfileImageData(jVar.f38220k);
        textView.setText(c22.p0.a(jVar.f38213d, jVar.f38211b));
        textView2.setText(NumberFormat.getNumberInstance(Locale.getDefault()).format(jVar.f38215f));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        View viewE = e5.e(viewGroup, R.layout.gcm_leaderboard_row, viewGroup, false);
        viewE.getClass();
        return new y0(viewE);
    }
}
