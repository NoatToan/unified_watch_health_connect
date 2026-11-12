package com.huawei.ui.commonui.linechart.model;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import defpackage.njy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class StorageGenericModel implements IStorageModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PresentStyle f23703c;
    private Map<String, Float> d = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Object> f23702b = new HashMap();

    public interface PresentStyle {
        boolean validate();
    }

    public void e(String str, float f) {
        this.d.put(str, Float.valueOf(f));
    }

    public void a(String str, Object obj) {
        List arrayList;
        if (this.f23702b.get(str) == null) {
            arrayList = new ArrayList();
            this.f23702b.put(str, arrayList);
        } else {
            Object obj2 = this.f23702b.get(str);
            if (!njy.b(obj2, Object.class)) {
                throw new RuntimeException("addGenericObject old not list");
            }
            arrayList = (List) obj2;
        }
        arrayList.add(obj);
    }

    public List<Object> e(String str) {
        if (str != null) {
            Object obj = this.f23702b.get(str);
            if (obj != null) {
                if (!njy.b(obj, Object.class)) {
                    throw new RuntimeException("queryGenericObjects old not list");
                }
                return (List) obj;
            }
            return Collections.EMPTY_LIST;
        }
        return Collections.EMPTY_LIST;
    }

    public void b(PresentStyle presentStyle) {
        this.f23703c = presentStyle;
    }

    public PresentStyle b() {
        return this.f23703c;
    }

    public boolean e() {
        PresentStyle presentStyle = this.f23703c;
        return presentStyle != null && presentStyle.validate();
    }

    public class d implements PresentStyle {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f23706b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String[] f23707c;

        public d(String str, String... strArr) {
            this.f23706b = str;
            if (strArr == null) {
                this.f23707c = null;
            } else {
                this.f23707c = (String[]) strArr.clone();
            }
        }

        public float d() {
            Float f = (Float) StorageGenericModel.this.d.get(this.f23706b);
            if (f != null) {
                return f.floatValue();
            }
            String[] strArr = this.f23707c;
            if (strArr == null || strArr.length == 0) {
                return 0.0f;
            }
            for (String str : strArr) {
                Float f2 = (Float) StorageGenericModel.this.d.get(str);
                if (f2 != null) {
                    return f2.floatValue();
                }
            }
            return 0.0f;
        }

        @Override // com.huawei.ui.commonui.linechart.model.StorageGenericModel.PresentStyle
        public boolean validate() {
            return !TextUtils.isEmpty(this.f23706b);
        }
    }

    public class a implements PresentStyle {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f23705c;
        private String d;

        public a(String str, String str2) {
            this.d = str;
            this.f23705c = str2;
            if ("HR_WARNING_MAX".equals(str2) && "HR_WARNING_MIN".equals(this.d) && StorageGenericModel.this.f23702b.size() == 0) {
                LogUtil.e("BarDataPresentation", "not has detail");
            }
        }

        public float c() {
            Float f = (Float) StorageGenericModel.this.d.get(this.f23705c);
            if (f == null) {
                return 0.0f;
            }
            return f.floatValue();
        }

        public float a() {
            Float f = (Float) StorageGenericModel.this.d.get(this.d);
            if (f == null) {
                return 0.0f;
            }
            return f.floatValue();
        }

        @Override // com.huawei.ui.commonui.linechart.model.StorageGenericModel.PresentStyle
        public boolean validate() {
            return !TextUtils.isEmpty(this.f23705c) && !TextUtils.isEmpty(this.d) && StorageGenericModel.this.d.containsKey(this.f23705c) && StorageGenericModel.this.d.containsKey(this.d);
        }
    }

    public static class c implements PresentStyle {
        @Override // com.huawei.ui.commonui.linechart.model.StorageGenericModel.PresentStyle
        public boolean validate() {
            return true;
        }

        public c(String str) {
        }
    }
}
