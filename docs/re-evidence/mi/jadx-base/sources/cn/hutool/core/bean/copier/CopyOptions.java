package cn.hutool.core.bean.copier;

import cn.hutool.core.bean.copier.CopyOptions;
import defpackage.c38;
import defpackage.g4h;
import defpackage.v4f;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.function.BiPredicate;

/* JADX INFO: loaded from: classes.dex */
public class CopyOptions implements Serializable {
    private static final long serialVersionUID = 1;
    protected Class<?> editable;
    protected Map<String, String> fieldMapping;
    protected c38<String> fieldNameEditor;
    protected boolean ignoreCase;
    protected boolean ignoreError;
    protected boolean ignoreNullValue;
    protected String[] ignoreProperties;
    protected BiPredicate<Field, Object> propertiesFilter;
    private Map<String, String> reversedFieldMapping;
    private boolean transientSupport;

    public CopyOptions() {
        this.transientSupport = true;
    }

    public static CopyOptions create() {
        return new CopyOptions();
    }

    private Map<String, String> getReversedMapping() {
        Map<String, String> map = this.fieldMapping;
        if (map == null) {
            return null;
        }
        if (this.reversedFieldMapping == null) {
            this.reversedFieldMapping = v4f.A(map);
        }
        return this.reversedFieldMapping;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$new$0(Field field, Object obj) {
        return true;
    }

    public String editFieldName(String str) {
        c38<String> c38Var = this.fieldNameEditor;
        return c38Var != null ? c38Var.a(str) : str;
    }

    public String getMappedFieldName(String str, boolean z) {
        Map<String, String> reversedMapping = z ? getReversedMapping() : this.fieldMapping;
        return v4f.o(reversedMapping) ? str : (String) g4h.e(reversedMapping.get(str), str);
    }

    public CopyOptions ignoreCase() {
        return setIgnoreCase(true);
    }

    public CopyOptions ignoreError() {
        return setIgnoreError(true);
    }

    public CopyOptions ignoreNullValue() {
        return setIgnoreNullValue(true);
    }

    public boolean isTransientSupport() {
        return this.transientSupport;
    }

    public CopyOptions setEditable(Class<?> cls) {
        this.editable = cls;
        return this;
    }

    public CopyOptions setFieldMapping(Map<String, String> map) {
        this.fieldMapping = map;
        return this;
    }

    public CopyOptions setFieldNameEditor(c38<String> c38Var) {
        this.fieldNameEditor = c38Var;
        return this;
    }

    public CopyOptions setIgnoreCase(boolean z) {
        this.ignoreCase = z;
        return this;
    }

    public CopyOptions setIgnoreError(boolean z) {
        this.ignoreError = z;
        return this;
    }

    public CopyOptions setIgnoreNullValue(boolean z) {
        this.ignoreNullValue = z;
        return this;
    }

    public CopyOptions setIgnoreProperties(String... strArr) {
        this.ignoreProperties = strArr;
        return this;
    }

    public CopyOptions setPropertiesFilter(BiPredicate<Field, Object> biPredicate) {
        this.propertiesFilter = biPredicate;
        return this;
    }

    public CopyOptions setTransientSupport(boolean z) {
        this.transientSupport = z;
        return this;
    }

    public static CopyOptions create(Class<?> cls, boolean z, String... strArr) {
        return new CopyOptions(cls, z, strArr);
    }

    public CopyOptions(Class<?> cls, boolean z, String... strArr) {
        this.transientSupport = true;
        this.propertiesFilter = new BiPredicate() { // from class: il4
            @Override // java.util.function.BiPredicate
            public final boolean test(Object obj, Object obj2) {
                return CopyOptions.lambda$new$0((Field) obj, obj2);
            }
        };
        this.editable = cls;
        this.ignoreNullValue = z;
        this.ignoreProperties = strArr;
    }
}
