package mt0;

import android.content.Context;
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
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lmt0/g0;", "Lmt0/m2;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "b", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g0 extends m2 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmt0/g0$b;", "", "<init>", "(Lmt0/g0;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public UserLevelImageView f120622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ImageView f120623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f120624c;

        public b(g0 g0Var) {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(Context context) {
        super(context, R.layout.gcm_adhoc_challenge_player_info_layout);
        context.getClass();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i14, View view2, ViewGroup viewGroup) {
        b bVar;
        b12.b bVar2;
        int i15;
        viewGroup.getClass();
        if (view2 == null) {
            view2 = LayoutInflater.from(getContext()).inflate(R.layout.gcm_adhoc_challenge_player_info_layout, viewGroup, false);
            view2.getClass();
            bVar = new b(this);
            bVar.f120622a = (UserLevelImageView) view2.findViewById(R.id.player_image);
            bVar.f120624c = (TextView) view2.findViewById(R.id.player_name);
            bVar.f120623b = (ImageView) view2.findViewById(R.id.player_checked);
            view2.setTag(bVar);
        } else {
            Object tag = view2.getTag();
            tag.getClass();
            bVar = (b) tag;
        }
        AdHocChallengePlayerDTO item = getItem(i14);
        if (!(item instanceof VivoKidAdHocChallengePlayerDTO) || (i15 = ((VivoKidAdHocChallengePlayerDTO) item).f38050p) == -1) {
            UserLevelImageView userLevelImageView = bVar.f120622a;
            if (userLevelImageView != null) {
                if (item == null || (bVar2 = item.f38019m) == null) {
                    bVar2 = b12.b.f14386g;
                }
                userLevelImageView.setProfileImageData(bVar2);
            }
        } else {
            UserLevelImageView userLevelImageView2 = bVar.f120622a;
            if (userLevelImageView2 != null) {
                userLevelImageView2.setImageUrl(uu.i0.d(i15));
            }
        }
        TextView textView = bVar.f120624c;
        textView.getClass();
        item.getClass();
        textView.setText(c22.p0.a(item.f38013g, item.f38014h));
        SparseBooleanArray sparseBooleanArray = this.f120715a;
        if (sparseBooleanArray == null || !sparseBooleanArray.get(i14, false)) {
            ImageView imageView = bVar.f120623b;
            imageView.getClass();
            imageView.setVisibility(8);
            return view2;
        }
        ImageView imageView2 = bVar.f120623b;
        imageView2.getClass();
        imageView2.setVisibility(0);
        return view2;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmt0/g0$a;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
