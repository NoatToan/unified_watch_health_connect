package yn1;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lyn1/b;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "", "", "", "remoteDeviceId", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", "bizOperationListener", "<init>", "(JLcom/garmin/android/library/backgroundtaskmanagement/b$a;)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends com.garmin.android.library.backgroundtaskmanagement.b<List<? extends String>> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f198173l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.garmin.android.library.backgroundtaskmanagement.b.a f198174m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j8, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.BACKGROUND_PRIORITY, aVar);
        aVar.getClass();
        this.f198173l = j8;
        this.f198174m = aVar;
        b(new a(this));
    }
}
