package yh2;

import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import hi2.d;
import java.util.concurrent.atomic.AtomicReference;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lyh2/a;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a extends u1 {

    /* JADX INFO: renamed from: yh2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyh2/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum EnumC3694a {
        None,
        /* JADX INFO: Fake field, exist only in values array */
        Saving,
        /* JADX INFO: Fake field, exist only in values array */
        SavingFailed,
        /* JADX INFO: Fake field, exist only in values array */
        AddSucceeded,
        /* JADX INFO: Fake field, exist only in values array */
        UpdateSucceeded,
        /* JADX INFO: Fake field, exist only in values array */
        DeleteSucceeded
    }

    public a() {
        new d("AddEditNetworkViewModel", null, 2, null);
        new AtomicReference(Boolean.FALSE);
        new y0(EnumC3694a.None);
    }
}
