package com.huawei.hms.feature.dynamic;

import android.os.Bundle;
import com.huawei.hms.common.util.Logger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes33.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13171a = "d";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d f13172b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set<String> f13173c;

    public void a(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("installed_module_name");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            Logger.w(f13171a, "Get installed module name failed.");
            this.f13173c = new HashSet();
            return;
        }
        Logger.i(f13171a, "Installed module name:" + stringArrayList);
        this.f13173c = new HashSet(stringArrayList);
    }

    public static d a() {
        return f13172b;
    }

    private d() {
    }
}
