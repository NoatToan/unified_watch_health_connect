package mt0;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengePlayerDTO;
import com.garmin.android.apps.connectmobile.leaderboard.model.VivoKidAdHocChallengePlayerDTO;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lmt0/n2;", "Lmt0/m2;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/garmin/android/apps/connectmobile/leaderboard/model/s;", "mChallengeActivityType", "", "mShowSyncTime", "<init>", "(Landroid/content/Context;Lcom/garmin/android/apps/connectmobile/leaderboard/model/s;Z)V", "b", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n2 extends m2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.leaderboard.model.s f120762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f120763c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmt0/n2$b;", "", "<init>", "(Lmt0/n2;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ViewGroup f120764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f120765b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public UserLevelImageView f120766c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ImageView f120767d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public TextView f120768e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public TextView f120769f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public TextView f120770g;

        public b(n2 n2Var) {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(Context context, com.garmin.android.apps.connectmobile.leaderboard.model.s sVar, boolean z14) {
        super(context, R.layout.challenge_leaderboard_list_item_3_0);
        context.getClass();
        sVar.getClass();
        this.f120762b = sVar;
        this.f120763c = z14;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i14, View view2, ViewGroup viewGroup) {
        b bVar;
        b12.b bVar2;
        int i15;
        viewGroup.getClass();
        if (view2 == null) {
            view2 = LayoutInflater.from(getContext()).inflate(R.layout.challenge_leaderboard_list_item_3_0, viewGroup, false);
            view2.getClass();
            bVar = new b(this);
            bVar.f120764a = (ViewGroup) view2.findViewById(R.id.challenge_leaderboard_item_container);
            bVar.f120765b = (TextView) view2.findViewById(R.id.challenge_leaderboard_rank);
            bVar.f120766c = (UserLevelImageView) view2.findViewById(R.id.challenge_leaderboard_profile_image);
            bVar.f120767d = (ImageView) view2.findViewById(R.id.challenge_leaderboard_checked);
            bVar.f120768e = (TextView) view2.findViewById(R.id.challenge_leaderboard_name);
            bVar.f120769f = (TextView) view2.findViewById(R.id.challenge_leaderboard_last_sync);
            bVar.f120770g = (TextView) view2.findViewById(R.id.challenge_leaderboard_value);
            view2.setTag(bVar);
        } else {
            Object tag = view2.getTag();
            tag.getClass();
            bVar = (b) tag;
        }
        AdHocChallengePlayerDTO item = getItem(i14);
        DateTime dateTimeN = null;
        boolean zG = p005kotlin.jvm.internal.s.g(String.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk()), item != null ? item.f38007a : null);
        ViewGroup viewGroup2 = bVar.f120764a;
        if (zG) {
            if (viewGroup2 != null) {
                viewGroup2.setBackgroundColor(a7.b.getColor(getContext(), R.color.gcm_surface_3));
            }
            TextView textView = bVar.f120768e;
            if (textView != null) {
                textView.setTypeface(h22.a.a("font/roboto_regular.ttf", getContext()));
            }
        } else {
            if (viewGroup2 != null) {
                viewGroup2.setBackgroundColor(a7.b.getColor(getContext(), R.color.gcm_list_item_background));
            }
            TextView textView2 = bVar.f120768e;
            if (textView2 != null) {
                textView2.setTypeface(h22.a.a("font/roboto_light.ttf", getContext()));
            }
        }
        TextView textView3 = bVar.f120765b;
        if (textView3 != null) {
            textView3.setText(String.valueOf(item != null ? Long.valueOf(item.f38010d) : null));
        }
        TextView textView4 = bVar.f120768e;
        if (textView4 != null) {
            textView4.setText(c22.p0.a(item != null ? item.f38013g : null, item != null ? item.f38014h : null));
        }
        TextView textView5 = bVar.f120770g;
        if (textView5 != null) {
            Context context = getContext();
            context.getClass();
            textView5.setText(com.garmin.android.apps.connectmobile.leaderboard.challenges.x.r(context, this.f120762b, item != null ? item.f38008b : 0.0d));
        }
        if (!(item instanceof VivoKidAdHocChallengePlayerDTO) || (i15 = ((VivoKidAdHocChallengePlayerDTO) item).f38050p) == -1) {
            UserLevelImageView userLevelImageView = bVar.f120766c;
            if (userLevelImageView != null) {
                if (item == null || (bVar2 = item.f38019m) == null) {
                    bVar2 = b12.b.f14386g;
                }
                userLevelImageView.setProfileImageData(bVar2);
            }
        } else {
            UserLevelImageView userLevelImageView2 = bVar.f120766c;
            if (userLevelImageView2 != null) {
                userLevelImageView2.setImageUrl(uu.i0.d(i15));
            }
        }
        SparseBooleanArray sparseBooleanArray = this.f120715a;
        if (sparseBooleanArray == null || !sparseBooleanArray.get(i14, false)) {
            ImageView imageView = bVar.f120767d;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        } else {
            ImageView imageView2 = bVar.f120767d;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
        }
        TextView textView6 = bVar.f120769f;
        if (this.f120763c) {
            if (textView6 != null) {
                textView6.setVisibility(0);
            }
            if (item != null && !TextUtils.isEmpty(item.f38009c)) {
                dateTimeN = c22.j0.N(item.f38009c, true);
            }
            TextView textView7 = bVar.f120769f;
            if (dateTimeN != null) {
                if (textView7 != null) {
                    Context context2 = getContext();
                    context2.getClass();
                    textView7.setText(xy2.b.o(context2, dateTimeN));
                    return view2;
                }
            } else if (textView7 != null) {
                textView7.setText(R.string.common_has_not_synced);
                return view2;
            }
        } else if (textView6 != null) {
            textView6.setVisibility(8);
        }
        return view2;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmt0/n2$a;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
