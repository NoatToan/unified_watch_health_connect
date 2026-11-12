package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lak;", "", "", "language", "Ljava/lang/String;", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "list", "<init>", "(Ljava/lang/String;Ljava/util/ArrayList;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f1115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final ArrayList<String> f1116b;

    public ak(@NotNull String language, @Nullable ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(language, "language");
        this.f1115a = language;
        this.f1116b = arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF1115a() {
        return this.f1115a;
    }
}
