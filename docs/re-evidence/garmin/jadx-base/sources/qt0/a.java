package qt0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import c22.p0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.leaderboard.model.MetricsMapDTO;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import e23.l;
import java.util.Arrays;
import java.util.Locale;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.x0;
import pm0.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u000bB+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lqt0/a;", "Landroid/widget/ArrayAdapter;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/MetricsMapDTO;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function1;", "", "mValueFormatter", "mCurrentUserDisplayName", "<init>", "(Landroid/content/Context;Le23/l;Ljava/lang/String;)V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends ArrayAdapter<MetricsMapDTO> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<MetricsMapDTO, String> f147455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kt0.a f147457c;

    /* JADX INFO: renamed from: qt0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqt0/a$a;", "", "<init>", "(Lqt0/a;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class C2773a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f147458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f147459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f147460c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f147461d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public UserLevelImageView f147462e;

        public C2773a(a aVar) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(Context context, l<? super MetricsMapDTO, String> lVar, String str) {
        super(context, R.layout.gcm_leaderboard_row);
        context.getClass();
        lVar.getClass();
        str.getClass();
        this.f147455a = lVar;
        this.f147456b = str;
        this.f147457c = (kt0.a) KoinJavaComponent.get$default(kt0.a.class, null, null, 6, null);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i14, View view2, ViewGroup viewGroup) {
        View viewInflate;
        C2773a c2773a;
        viewGroup.getClass();
        if (view2 == null) {
            c2773a = new C2773a(this);
            viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.gcm_leaderboard_row, viewGroup, false);
            c2773a.f147458a = viewInflate.findViewById(R.id.leaderboard_containter_row);
            c2773a.f147460c = (TextView) viewInflate.findViewById(R.id.leaderboard_row_name);
            c2773a.f147459b = (TextView) viewInflate.findViewById(R.id.leaderboard_row_ranking);
            c2773a.f147461d = (TextView) viewInflate.findViewById(R.id.leaderboard_row_value);
            c2773a.f147462e = (UserLevelImageView) viewInflate.findViewById(R.id.leaderboard_row_icon);
            viewInflate.setTag(c2773a);
        } else {
            Object tag = view2.getTag();
            tag.getClass();
            C2773a c2773a2 = (C2773a) tag;
            viewInflate = view2;
            c2773a = c2773a2;
        }
        MetricsMapDTO item = getItem(i14);
        if (item != null) {
            View view3 = c2773a.f147458a;
            if (view3 != null) {
                view3.setOnClickListener(new h(6, this, item));
            }
            com.garmin.android.apps.connectmobile.connections.model.c cVar = item.f38035c;
            boolean zG = s.g(cVar != null ? cVar.f31696b : null, this.f147456b);
            TextView textView = c2773a.f147460c;
            if (zG) {
                if (textView != null) {
                    textView.setTypeface(textView.getTypeface(), 1);
                }
                TextView textView2 = c2773a.f147461d;
                if (textView2 != null) {
                    textView2.setTypeface(textView2.getTypeface(), 1);
                    textView2.setTextColor(a7.b.getColor(getContext(), R.color.gcm_text_primary));
                }
                View view4 = c2773a.f147458a;
                if (view4 != null) {
                    view4.setBackgroundResource(R.drawable.gcm3_highlighted_list_item_selector);
                }
            } else {
                if (textView != null) {
                    textView.setTypeface(textView.getTypeface(), 0);
                }
                TextView textView3 = c2773a.f147461d;
                if (textView3 != null) {
                    textView3.setTypeface(textView3.getTypeface(), 0);
                    textView3.setTextColor(a7.b.getColor(getContext(), R.color.gcm_text_secondary));
                }
                View view5 = c2773a.f147458a;
                if (view5 != null) {
                    view5.setBackgroundResource(R.drawable.gcm_surface_1_selector_background);
                }
            }
            TextView textView4 = c2773a.f147459b;
            if (textView4 != null) {
                x0 x0Var = x0.f105818a;
                Locale locale = Locale.getDefault();
                String string = getContext().getString(R.string.format_decimal_value);
                string.getClass();
                textView4.setText(String.format(locale, string, Arrays.copyOf(new Object[]{Integer.valueOf(item.f38033a)}, 1)));
            }
            UserLevelImageView userLevelImageView = c2773a.f147462e;
            if (userLevelImageView != null) {
                b12.b bVar = item.f38035c.f31701g;
                bVar.getClass();
                userLevelImageView.setProfileImageData(bVar);
            }
            TextView textView5 = c2773a.f147460c;
            if (textView5 != null) {
                com.garmin.android.apps.connectmobile.connections.model.c cVar2 = item.f38035c;
                textView5.setText(p0.a(cVar2.f31697c, cVar2.f31696b));
            }
            TextView textView6 = c2773a.f147461d;
            if (textView6 != null) {
                String strInvoke = this.f147455a.invoke(item);
                if (strInvoke == null) {
                    strInvoke = String.valueOf(item.f38034b);
                }
                textView6.setText(strInvoke);
            }
        }
        return viewInflate;
    }
}
