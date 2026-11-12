package i10;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import c22.j0;
import c22.l3;
import c22.m3;
import c22.p0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupChallengePlayerDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import f12.l;
import g22.n;
import hx0.k;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Locale;
import lc.u0;
import mt0.x0;
import mt0.y0;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.a1;
import yc.x2;
import yc.z0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\f\rB!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Li10/a;", "Lyc/x2;", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupChallengePlayerDTO;", "Lmt0/y0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "mCurrentUserDisplayName", "Lmt0/x0;", "leaderboardOptions", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lmt0/x0;)V", "b", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends x2<GroupChallengePlayerDTO, y0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f86997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f86998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x0 f86999f;

    /* JADX INFO: renamed from: i10.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Li10/a$a;", "Landroidx/recyclerview/widget/o$f;", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupChallengePlayerDTO;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1727a extends o.f<GroupChallengePlayerDTO> {
        public static boolean d(GroupChallengePlayerDTO groupChallengePlayerDTO, GroupChallengePlayerDTO groupChallengePlayerDTO2) {
            groupChallengePlayerDTO.getClass();
            groupChallengePlayerDTO2.getClass();
            return s.g(groupChallengePlayerDTO.f31537a, groupChallengePlayerDTO2.f31537a) && s.g(groupChallengePlayerDTO.f31538b, groupChallengePlayerDTO2.f31538b) && s.g(groupChallengePlayerDTO.f31539c, groupChallengePlayerDTO2.f31539c) && s.g(groupChallengePlayerDTO.f31540d, groupChallengePlayerDTO2.f31540d) && s.g(groupChallengePlayerDTO.f31541e, groupChallengePlayerDTO2.f31541e) && groupChallengePlayerDTO.f31547k == groupChallengePlayerDTO2.f31547k && groupChallengePlayerDTO.f31542f == groupChallengePlayerDTO2.f31542f && s.g(groupChallengePlayerDTO.f31543g, groupChallengePlayerDTO2.f31543g) && groupChallengePlayerDTO.f31544h == groupChallengePlayerDTO2.f31544h && groupChallengePlayerDTO.f31545i == groupChallengePlayerDTO2.f31545i && groupChallengePlayerDTO.f31546j == groupChallengePlayerDTO2.f31546j;
        }

        @Override // androidx.recyclerview.widget.o.f
        public final boolean a(GroupChallengePlayerDTO groupChallengePlayerDTO, GroupChallengePlayerDTO groupChallengePlayerDTO2) {
            GroupChallengePlayerDTO groupChallengePlayerDTO3 = groupChallengePlayerDTO;
            GroupChallengePlayerDTO groupChallengePlayerDTO4 = groupChallengePlayerDTO2;
            groupChallengePlayerDTO3.getClass();
            groupChallengePlayerDTO4.getClass();
            return d(groupChallengePlayerDTO3, groupChallengePlayerDTO4);
        }

        @Override // androidx.recyclerview.widget.o.f
        public final /* bridge */ /* synthetic */ boolean b(GroupChallengePlayerDTO groupChallengePlayerDTO, GroupChallengePlayerDTO groupChallengePlayerDTO2) {
            return d(groupChallengePlayerDTO, groupChallengePlayerDTO2);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Li10/a$b;", "Lyc/a1;", "Lxg0/i;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends a1<xg0.i> {
        @Override // yc.a1
        public final boolean r(z0 z0Var) {
            z0Var.getClass();
            return z0Var instanceof z0.b;
        }

        @Override // yc.a1
        public final void t(RecyclerView.f0 f0Var, z0 z0Var) {
            z0Var.getClass();
            ((xg0.i) f0Var).d();
        }

        @Override // yc.a1
        public final RecyclerView.f0 u(ViewGroup viewGroup, z0 z0Var) {
            z0Var.getClass();
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.news_feed_loading_item, viewGroup, false);
            viewInflate.getClass();
            return new xg0.i(viewInflate);
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f87000a;

        static {
            int[] iArr = new int[x0.values().length];
            try {
                iArr[x0.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x0.CYCLING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x0.PARASPORTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x0.STEPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[x0.PUSHES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[x0.SWIMMING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[x0.CALORIES_BURNED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f87000a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, String str, x0 x0Var) {
        super(new C1727a(), (t13.g) null, (t13.g) null, 6, (p005kotlin.jvm.internal.j) null);
        context.getClass();
        str.getClass();
        x0Var.getClass();
        this.f86997d = context;
        this.f86998e = str;
        this.f86999f = x0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        DateTime dateTimeN;
        y0 y0Var = (y0) f0Var;
        y0Var.getClass();
        TextView textView = y0Var.f120931c;
        View view2 = y0Var.f120929a;
        TextView textView2 = y0Var.f120933e;
        TextView textView3 = y0Var.f120932d;
        GroupChallengePlayerDTO groupChallengePlayerDTOT = t(i14);
        if (groupChallengePlayerDTOT == null) {
            return;
        }
        view2.setOnClickListener(new k(4, this, groupChallengePlayerDTOT));
        String str = groupChallengePlayerDTOT.f31539c;
        Context context = this.f86997d;
        if (str == null || !str.equals(this.f86998e)) {
            textView.setTypeface(textView.getTypeface(), 0);
            textView3.setTypeface(textView3.getTypeface(), 0);
            textView3.setTextColor(a7.b.getColor(context, R.color.gcm_text_secondary));
            textView2.setTypeface(textView2.getTypeface(), 0);
            view2.setBackgroundResource(R.drawable.gcm_surface_1_selector_background);
        } else {
            textView.setTypeface(textView.getTypeface(), 1);
            textView3.setTypeface(textView3.getTypeface(), 1);
            textView3.setTextColor(a7.b.getColor(context, R.color.gcm_text_primary));
            textView2.setTypeface(textView2.getTypeface(), 1);
            view2.setBackgroundResource(R.drawable.gcm3_highlighted_list_item_selector);
        }
        TextView textView4 = y0Var.f120930b;
        p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
        Locale locale = Locale.getDefault();
        String string = context.getString(R.string.format_decimal_value);
        string.getClass();
        textView4.setText(String.format(locale, string, Arrays.copyOf(new Object[]{Integer.valueOf(groupChallengePlayerDTOT.f31544h)}, 1)));
        UserLevelImageView userLevelImageView = y0Var.f120934f;
        b12.b bVar = groupChallengePlayerDTOT.f31548l;
        bVar.getClass();
        userLevelImageView.setProfileImageData(bVar);
        textView.setText(p0.a(groupChallengePlayerDTOT.f31538b, groupChallengePlayerDTOT.f31539c));
        double d14 = groupChallengePlayerDTOT.f31542f;
        switch (c.f87000a[this.f86999f.ordinal()]) {
            case 1:
            case 2:
            case 3:
                boolean zY = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
                l3.a aVar = l3.f23124b;
                m3 m3Var = zY ? m3.KILOMETER : m3.MILE;
                DecimalFormat decimalFormat = l3.f23129g;
                aVar.getClass();
                textView3.setText(l3.a.O(this.f86997d, d14, m3Var, decimalFormat, true));
                break;
            case 4:
            case 5:
                textView3.setText(NumberFormat.getNumberInstance(Locale.getDefault()).format(d14));
                break;
            case 6:
                boolean zY2 = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
                l3.a aVar2 = l3.f23124b;
                m3 m3Var2 = zY2 ? m3.METER : m3.YARD;
                aVar2.getClass();
                textView3.setText(l3.a.O(this.f86997d, d14, m3Var2, l3.f23131i, true));
                break;
            case 7:
                textView3.setText(l3.a.H(l3.f23124b, new l22.a(context), d14, true));
                break;
            default:
                u0.r();
                return;
        }
        try {
            dateTimeN = !TextUtils.isEmpty(groupChallengePlayerDTOT.f31543g) ? j0.N(groupChallengePlayerDTOT.f31543g, true) : null;
        } catch (ParseException e4) {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.CONNECTIONS;
            aVar3.getClass();
            i2.a.g(a2Var, "GroupChallengeLeaderboardAdapter", e4);
        }
        String strO = dateTimeN != null ? xy2.b.o(context, dateTimeN) : null;
        if (n.d(strO)) {
            textView2.setText(strO);
        } else {
            textView2.setText(R.string.symbol_double_dash);
        }
        textView2.setVisibility(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gcm_leaderboard_row, viewGroup, false);
        viewInflate.getClass();
        return new y0(viewInflate);
    }

    public /* synthetic */ a(Context context, String str, x0 x0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, str, (i14 & 4) != 0 ? x0.STEPS : x0Var);
    }
}
