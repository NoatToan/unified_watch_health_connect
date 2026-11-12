package com.huami.nps;

import com.huami.nps.di.NpsModuleKt;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.koin.core.module.Module;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\")\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Ljava/util/ArrayList;", "Lorg/koin/core/module/Module;", "Lkotlin/collections/ArrayList;", "a", "Ljava/util/ArrayList;", "getNpsModuleInter", "()Ljava/util/ArrayList;", "npsModuleInter", "nps_release"}, k = 2, mv = {1, 5, 1})
public final class NpsUIModuleKt {

    @NotNull
    private static final ArrayList<Module> a;

    static {
        ArrayList<Module> arrayList = new ArrayList<>();
        arrayList.add(NpsModuleKt.getNpsModuleInterval());
        a = arrayList;
    }

    @NotNull
    public static final ArrayList<Module> getNpsModuleInter() {
        return a;
    }
}
