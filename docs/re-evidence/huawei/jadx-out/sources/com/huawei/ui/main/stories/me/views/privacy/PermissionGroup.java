package com.huawei.ui.main.stories.me.views.privacy;

import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class PermissionGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f28563a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28565c;
    private int d;
    private int e;
    private List<String> g;
    private PermissionStatus i = PermissionStatus.NOT_GRANTED;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f28564b = false;

    public enum PermissionStatus {
        GRANTED,
        PARTIAL_GRANTED,
        NOT_GRANTED,
        GO_SETTING
    }

    public PermissionGroup(String str, int i, int i2, List<String> list) {
        this.f28563a = str;
        this.f28565c = i;
        this.e = i2;
        this.g = list;
    }

    public static PermissionGroup c(int i, int i2) {
        PermissionGroup permissionGroup = new PermissionGroup("KEEP_ALIVE", i, i2, null);
        permissionGroup.e(PermissionStatus.GO_SETTING);
        permissionGroup.a(true);
        return permissionGroup;
    }

    public boolean g() {
        return this.f28564b;
    }

    public void a(boolean z) {
        this.f28564b = z;
    }

    public String e() {
        return this.f28563a;
    }

    public int d() {
        return this.f28565c;
    }

    public int b() {
        return this.e;
    }

    public List<String> c() {
        return this.g;
    }

    public PermissionStatus i() {
        return this.i;
    }

    public void e(PermissionStatus permissionStatus) {
        this.i = permissionStatus;
    }

    public int f() {
        if (g()) {
            return 0;
        }
        return (this.i == PermissionStatus.NOT_GRANTED || this.i == PermissionStatus.PARTIAL_GRANTED) ? 1 : 2;
    }

    public int a() {
        return this.d;
    }

    public void a(int i) {
        this.d = i;
    }

    public void b(String str) {
        LogUtil.a(str, "updateGroupStatus, groupId: ", this.f28563a, ", status: ", this.i);
    }
}
