package com.huawei.haf.bundle.extension;

import android.content.Context;
import com.huawei.haf.bundle.AppBundleBuildConfig;
import com.huawei.haf.bundle.extension.fakecomponents.FakeActivity;
import com.huawei.haf.bundle.extension.fakecomponents.FakeReceiver;
import com.huawei.haf.bundle.extension.fakecomponents.FakeService;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ComponentInfoProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ComponentInfoProvider f5814b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f5815a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<String> f5816c = new ArrayList();
    private final List<String> d = new ArrayList();
    private final List<String> e = new ArrayList();

    private ComponentInfoProvider() {
        Set<String> setB = AppBundleBuildConfig.b();
        if (setB.isEmpty()) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer(64);
        Iterator<String> it = setB.iterator();
        while (it.hasNext()) {
            c(it.next(), stringBuffer);
        }
    }

    public static ComponentInfoProvider c() {
        if (f5814b == null) {
            f5814b = new ComponentInfoProvider();
        }
        return f5814b;
    }

    public Class<?> c(String str) {
        if (this.f5816c.contains(str)) {
            return FakeActivity.class;
        }
        if (this.d.contains(str)) {
            return FakeService.class;
        }
        if (this.e.contains(str)) {
            return FakeReceiver.class;
        }
        return null;
    }

    public String b(String str) {
        return this.f5815a.get(str);
    }

    public String c(Context context, String str) {
        return ComponentInfoReader.d(context, str);
    }

    public String b(Context context, String str) {
        return ComponentInfoReader.b(context, str);
    }

    private void c(String str, StringBuffer stringBuffer) {
        stringBuffer.delete(0, stringBuffer.length());
        e(ComponentInfoReader.c(str), this.f5816c, str, "Activities", stringBuffer);
        e(ComponentInfoReader.b(str), this.d, str, "Services", stringBuffer);
        e(ComponentInfoReader.a(str), this.e, str, "Receivers", stringBuffer);
        if (stringBuffer.length() > 0) {
            LogUtil.b("Bundle_ComponentInfo", str, " {", stringBuffer.toString(), "}");
        }
    }

    private void e(String[] strArr, List<String> list, String str, String str2, StringBuffer stringBuffer) {
        if (strArr.length == 0) {
            return;
        }
        list.addAll(Arrays.asList(strArr));
        for (String str3 : strArr) {
            this.f5815a.put(str3, str);
        }
        if (stringBuffer.length() > 0) {
            stringBuffer.append(", ");
        }
        stringBuffer.append(str2).append('=').append(strArr.length);
    }
}
