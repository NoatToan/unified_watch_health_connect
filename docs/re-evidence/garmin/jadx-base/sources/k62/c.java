package k62;

import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO;
import com.google.firebase.messaging.Constants;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import u62.z;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lk62/c;", "", "", "loading", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDTO;", "workouts", "<init>", "(ZZLjava/util/List;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f103173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f103174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<WorkoutDTO> f103175c;

    public /* synthetic */ c(boolean z14, boolean z15, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? null : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f103173a == cVar.f103173a && this.f103174b == cVar.f103174b && s.g(this.f103175c, cVar.f103175c);
    }

    public final int hashCode() {
        int iG = q6.f.g(Boolean.hashCode(this.f103173a) * 31, 31, this.f103174b);
        List<WorkoutDTO> list = this.f103175c;
        return iG + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return z.c(com.airbnb.lottie.animation.keyframe.a.m("MyWorkoutListUiState(loading=", ", error=", ", workouts=", this.f103173a, this.f103174b), this.f103175c, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(boolean z14, boolean z15, List<? extends WorkoutDTO> list) {
        this.f103173a = z14;
        this.f103174b = z15;
        this.f103175c = list;
    }

    public c() {
        this(false, false, null, 7, null);
    }
}
