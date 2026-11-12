package mt0;

import android.content.Context;
import android.util.SparseBooleanArray;
import android.widget.ArrayAdapter;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengePlayerDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0017\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\tB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lmt0/m2;", "Landroid/widget/ArrayAdapter;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/AdHocChallengePlayerDTO;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "layoutRes", "<init>", "(Landroid/content/Context;I)V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class m2 extends ArrayAdapter<AdHocChallengePlayerDTO> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SparseBooleanArray f120715a;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(Context context, int i14) {
        super(context, i14);
        context.getClass();
    }

    @Override // android.widget.ArrayAdapter
    public final void clear() {
        super.clear();
        SparseBooleanArray sparseBooleanArray = this.f120715a;
        if (sparseBooleanArray != null) {
            sparseBooleanArray.clear();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmt0/m2$a;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
