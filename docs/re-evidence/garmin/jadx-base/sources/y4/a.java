package y4;

import android.view.MotionEvent;
import com.garmin.android.gncs.NotificationConstants;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ly4/a;", "", "", "Ly4/d;", "changes", "Ly4/c;", NotificationConstants.KEY_DATA_MIME_TYPE, "Ly4/b;", "primaryDirectionalMotionAxis", "Landroid/view/MotionEvent;", "nativeEvent", "<init>", "(Ljava/util/List;IILandroid/view/MotionEvent;Lkotlin/jvm/internal/j;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<d> f194370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f194371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MotionEvent f194372c;

    private a(List<d> list, int i14, int i15, MotionEvent motionEvent) {
        this.f194370a = list;
        this.f194371b = i15;
        this.f194372c = motionEvent;
        if (list.isEmpty()) {
            h.s("changes cannot be empty");
            throw null;
        }
    }

    public /* synthetic */ a(List list, int i14, int i15, MotionEvent motionEvent, j jVar) {
        this(list, i14, i15, motionEvent);
    }
}
