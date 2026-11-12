package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ko, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lko;", "", "", "toString", "", "value", "<init>", "(I)V", "Lio;", "Ljo;", "Lmo;", "Lno;", "Lkv;", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public abstract class PairStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final int value;

    public /* synthetic */ PairStatus(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    @NotNull
    public String toString() {
        return "PairStatus(value=" + this.value + ')';
    }

    public PairStatus(int i) {
        this.value = i;
    }
}
