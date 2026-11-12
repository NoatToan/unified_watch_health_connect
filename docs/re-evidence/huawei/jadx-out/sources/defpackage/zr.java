package defpackage;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.huawei.hms.network.embedded.g4;
import com.huawei.operation.utils.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes21.dex */
public class zr implements Iterable<SettableBeanProperty>, Serializable {
    private static final long serialVersionUID = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, List<ys>> f54521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f54522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final boolean f54523c;
    private Object[] d;
    private final Map<String, String> e;
    private final SettableBeanProperty[] g;
    private int h;
    private int i;
    private final Locale j;

    private static final int a(int i) {
        if (i <= 5) {
            return 8;
        }
        if (i <= 12) {
            return 16;
        }
        int i2 = 32;
        while (i2 < (i >> 2) + i) {
            i2 += i2;
        }
        return i2;
    }

    public zr(boolean z, Collection<SettableBeanProperty> collection, Map<String, List<ys>> map, Locale locale) {
        this.f54523c = z;
        this.g = (SettableBeanProperty[]) collection.toArray(new SettableBeanProperty[collection.size()]);
        this.f54521a = map;
        this.j = locale;
        this.e = c(map, z, locale);
        a(collection);
    }

    private zr(zr zrVar, SettableBeanProperty settableBeanProperty, int i, int i2) {
        this.f54523c = zrVar.f54523c;
        this.j = zrVar.j;
        this.f54522b = zrVar.f54522b;
        this.h = zrVar.h;
        this.i = zrVar.i;
        this.f54521a = zrVar.f54521a;
        this.e = zrVar.e;
        Object[] objArr = zrVar.d;
        this.d = Arrays.copyOf(objArr, objArr.length);
        SettableBeanProperty[] settableBeanPropertyArr = zrVar.g;
        SettableBeanProperty[] settableBeanPropertyArr2 = (SettableBeanProperty[]) Arrays.copyOf(settableBeanPropertyArr, settableBeanPropertyArr.length);
        this.g = settableBeanPropertyArr2;
        this.d[i] = settableBeanProperty;
        settableBeanPropertyArr2[i2] = settableBeanProperty;
    }

    private zr(zr zrVar, SettableBeanProperty settableBeanProperty, String str, int i) {
        this.f54523c = zrVar.f54523c;
        this.j = zrVar.j;
        this.f54522b = zrVar.f54522b;
        this.h = zrVar.h;
        this.i = zrVar.i;
        this.f54521a = zrVar.f54521a;
        this.e = zrVar.e;
        Object[] objArr = zrVar.d;
        this.d = Arrays.copyOf(objArr, objArr.length);
        SettableBeanProperty[] settableBeanPropertyArr = zrVar.g;
        int length = settableBeanPropertyArr.length;
        SettableBeanProperty[] settableBeanPropertyArr2 = (SettableBeanProperty[]) Arrays.copyOf(settableBeanPropertyArr, length + 1);
        this.g = settableBeanPropertyArr2;
        settableBeanPropertyArr2[length] = settableBeanProperty;
        int i2 = this.f54522b + 1;
        int i3 = i << 1;
        Object[] objArr2 = this.d;
        if (objArr2[i3] != null) {
            i3 = ((i >> 1) + i2) << 1;
            if (objArr2[i3] != null) {
                int i4 = this.i;
                i3 = ((i2 + (i2 >> 1)) << 1) + i4;
                this.i = i4 + 2;
                if (i3 >= objArr2.length) {
                    this.d = Arrays.copyOf(objArr2, objArr2.length + 4);
                }
            }
        }
        Object[] objArr3 = this.d;
        objArr3[i3] = str;
        objArr3[i3 + 1] = settableBeanProperty;
    }

    protected zr(zr zrVar, boolean z) {
        this.f54523c = z;
        this.j = zrVar.j;
        this.f54521a = zrVar.f54521a;
        this.e = zrVar.e;
        SettableBeanProperty[] settableBeanPropertyArr = zrVar.g;
        SettableBeanProperty[] settableBeanPropertyArr2 = (SettableBeanProperty[]) Arrays.copyOf(settableBeanPropertyArr, settableBeanPropertyArr.length);
        this.g = settableBeanPropertyArr2;
        a(Arrays.asList(settableBeanPropertyArr2));
    }

    public zr a(boolean z) {
        return this.f54523c == z ? this : new zr(this, z);
    }

    protected void a(Collection<SettableBeanProperty> collection) {
        int size = collection.size();
        this.h = size;
        int iA = a(size);
        this.f54522b = iA - 1;
        int i = (iA >> 1) + iA;
        Object[] objArrCopyOf = new Object[i * 2];
        int i2 = 0;
        for (SettableBeanProperty settableBeanProperty : collection) {
            if (settableBeanProperty != null) {
                String strB = b(settableBeanProperty);
                int iC = c(strB);
                int i3 = iC << 1;
                if (objArrCopyOf[i3] != null) {
                    i3 = ((iC >> 1) + iA) << 1;
                    if (objArrCopyOf[i3] != null) {
                        i3 = (i << 1) + i2;
                        i2 += 2;
                        if (i3 >= objArrCopyOf.length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length + 4);
                        }
                    }
                }
                objArrCopyOf[i3] = strB;
                objArrCopyOf[i3 + 1] = settableBeanProperty;
            }
        }
        this.d = objArrCopyOf;
        this.i = i2;
    }

    public static zr b(MapperConfig<?> mapperConfig, Collection<SettableBeanProperty> collection, Map<String, List<ys>> map, boolean z) {
        return new zr(z, collection, map, mapperConfig.getLocale());
    }

    public zr d(SettableBeanProperty settableBeanProperty) {
        String strB = b(settableBeanProperty);
        int length = this.d.length;
        for (int i = 1; i < length; i += 2) {
            SettableBeanProperty settableBeanProperty2 = (SettableBeanProperty) this.d[i];
            if (settableBeanProperty2 != null && settableBeanProperty2.getName().equals(strB)) {
                return new zr(this, settableBeanProperty, i, a(settableBeanProperty2));
            }
        }
        return new zr(this, settableBeanProperty, strB, c(strB));
    }

    public zr c() {
        int length = this.d.length;
        int i = 0;
        for (int i2 = 1; i2 < length; i2 += 2) {
            SettableBeanProperty settableBeanProperty = (SettableBeanProperty) this.d[i2];
            if (settableBeanProperty != null) {
                settableBeanProperty.assignIndex(i);
                i++;
            }
        }
        return this;
    }

    public zr e(NameTransformer nameTransformer) {
        if (nameTransformer == null || nameTransformer == NameTransformer.NOP) {
            return this;
        }
        int length = this.g.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            SettableBeanProperty settableBeanProperty = this.g[i];
            if (settableBeanProperty == null) {
                arrayList.add(settableBeanProperty);
            } else {
                arrayList.add(b(settableBeanProperty, nameTransformer));
            }
        }
        return new zr(this.f54523c, arrayList, this.f54521a, this.j);
    }

    public zr a(Collection<String> collection, Collection<String> collection2) {
        if ((collection == null || collection.isEmpty()) && collection2 == null) {
            return this;
        }
        int length = this.g.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            SettableBeanProperty settableBeanProperty = this.g[i];
            if (settableBeanProperty != null && !ahy.b(settableBeanProperty.getName(), collection, collection2)) {
                arrayList.add(settableBeanProperty);
            }
        }
        return new zr(this.f54523c, arrayList, this.f54521a, this.j);
    }

    public void b(SettableBeanProperty settableBeanProperty, SettableBeanProperty settableBeanProperty2) {
        int length = this.d.length;
        for (int i = 1; i <= length; i += 2) {
            Object[] objArr = this.d;
            if (objArr[i] == settableBeanProperty) {
                objArr[i] = settableBeanProperty2;
                this.g[a(settableBeanProperty)] = settableBeanProperty2;
                return;
            }
        }
        throw new NoSuchElementException("No entry '" + settableBeanProperty.getName() + "' found, can't replace");
    }

    public void e(SettableBeanProperty settableBeanProperty) {
        ArrayList arrayList = new ArrayList(this.h);
        String strB = b(settableBeanProperty);
        int length = this.d.length;
        boolean zEquals = false;
        for (int i = 1; i < length; i += 2) {
            Object[] objArr = this.d;
            SettableBeanProperty settableBeanProperty2 = (SettableBeanProperty) objArr[i];
            if (settableBeanProperty2 != null) {
                if (!zEquals && (zEquals = strB.equals(objArr[i - 1]))) {
                    this.g[a(settableBeanProperty2)] = null;
                } else {
                    arrayList.add(settableBeanProperty2);
                }
            }
        }
        if (!zEquals) {
            throw new NoSuchElementException("No entry '" + settableBeanProperty.getName() + "' found, can't remove");
        }
        a(arrayList);
    }

    public int d() {
        return this.h;
    }

    public boolean b() {
        return this.f54523c;
    }

    @Override // java.lang.Iterable
    public Iterator<SettableBeanProperty> iterator() {
        return a().iterator();
    }

    private List<SettableBeanProperty> a() {
        ArrayList arrayList = new ArrayList(this.h);
        int length = this.d.length;
        for (int i = 1; i < length; i += 2) {
            SettableBeanProperty settableBeanProperty = (SettableBeanProperty) this.d[i];
            if (settableBeanProperty != null) {
                arrayList.add(settableBeanProperty);
            }
        }
        return arrayList;
    }

    public SettableBeanProperty[] e() {
        return this.g;
    }

    protected final String b(SettableBeanProperty settableBeanProperty) {
        boolean z = this.f54523c;
        String name = settableBeanProperty.getName();
        return z ? name.toLowerCase(this.j) : name;
    }

    public SettableBeanProperty c(int i) {
        int length = this.d.length;
        for (int i2 = 1; i2 < length; i2 += 2) {
            SettableBeanProperty settableBeanProperty = (SettableBeanProperty) this.d[i2];
            if (settableBeanProperty != null && i == settableBeanProperty.getPropertyIndex()) {
                return settableBeanProperty;
            }
        }
        return null;
    }

    public SettableBeanProperty b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Cannot pass null property name");
        }
        if (this.f54523c) {
            str = str.toLowerCase(this.j);
        }
        int iHashCode = str.hashCode() & this.f54522b;
        int i = iHashCode << 1;
        Object obj = this.d[i];
        if (obj == str || str.equals(obj)) {
            return (SettableBeanProperty) this.d[i + 1];
        }
        return a(str, iHashCode, obj);
    }

    private final SettableBeanProperty a(String str, int i, Object obj) {
        if (obj == null) {
            return d(this.e.get(str));
        }
        int i2 = this.f54522b + 1;
        int i3 = ((i >> 1) + i2) << 1;
        Object obj2 = this.d[i3];
        if (str.equals(obj2)) {
            return (SettableBeanProperty) this.d[i3 + 1];
        }
        if (obj2 != null) {
            int i4 = (i2 + (i2 >> 1)) << 1;
            int i5 = this.i;
            for (int i6 = i4; i6 < i5 + i4; i6 += 2) {
                Object obj3 = this.d[i6];
                if (obj3 == str || str.equals(obj3)) {
                    return (SettableBeanProperty) this.d[i6 + 1];
                }
            }
        }
        return d(this.e.get(str));
    }

    private SettableBeanProperty d(String str) {
        if (str == null) {
            return null;
        }
        int iC = c(str);
        int i = iC << 1;
        Object obj = this.d[i];
        if (str.equals(obj)) {
            return (SettableBeanProperty) this.d[i + 1];
        }
        if (obj == null) {
            return null;
        }
        return d(str, iC, obj);
    }

    private SettableBeanProperty d(String str, int i, Object obj) {
        int i2 = this.f54522b + 1;
        int i3 = ((i >> 1) + i2) << 1;
        Object obj2 = this.d[i3];
        if (str.equals(obj2)) {
            return (SettableBeanProperty) this.d[i3 + 1];
        }
        if (obj2 == null) {
            return null;
        }
        int i4 = (i2 + (i2 >> 1)) << 1;
        int i5 = this.i;
        for (int i6 = i4; i6 < i5 + i4; i6 += 2) {
            Object obj3 = this.d[i6];
            if (obj3 == str || str.equals(obj3)) {
                return (SettableBeanProperty) this.d[i6 + 1];
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Properties=[");
        int i = 0;
        for (SettableBeanProperty settableBeanProperty : this) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(settableBeanProperty.getName());
            sb.append(g4.k);
            sb.append(settableBeanProperty.getType());
            sb.append(g4.l);
            i++;
        }
        sb.append(']');
        if (!this.f54521a.isEmpty()) {
            sb.append("(aliases: ");
            sb.append(this.f54521a);
            sb.append(Constants.RIGHT_BRACKET_ONLY);
        }
        return sb.toString();
    }

    protected SettableBeanProperty b(SettableBeanProperty settableBeanProperty, NameTransformer nameTransformer) {
        JsonDeserializer<Object> jsonDeserializerUnwrappingDeserializer;
        if (settableBeanProperty == null) {
            return settableBeanProperty;
        }
        SettableBeanProperty settableBeanPropertyWithSimpleName = settableBeanProperty.withSimpleName(nameTransformer.transform(settableBeanProperty.getName()));
        JsonDeserializer<Object> valueDeserializer = settableBeanPropertyWithSimpleName.getValueDeserializer();
        return (valueDeserializer == null || (jsonDeserializerUnwrappingDeserializer = valueDeserializer.unwrappingDeserializer(nameTransformer)) == valueDeserializer) ? settableBeanPropertyWithSimpleName : settableBeanPropertyWithSimpleName.withValueDeserializer(jsonDeserializerUnwrappingDeserializer);
    }

    private final int a(SettableBeanProperty settableBeanProperty) {
        int length = this.g.length;
        for (int i = 0; i < length; i++) {
            if (this.g[i] == settableBeanProperty) {
                return i;
            }
        }
        throw new IllegalStateException("Illegal state: property '" + settableBeanProperty.getName() + "' missing from _propsInOrder");
    }

    private final int c(String str) {
        return str.hashCode() & this.f54522b;
    }

    private Map<String, String> c(Map<String, List<ys>> map, boolean z, Locale locale) {
        if (map == null || map.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        HashMap map2 = new HashMap();
        for (Map.Entry<String, List<ys>> entry : map.entrySet()) {
            String key = entry.getKey();
            if (z) {
                key = key.toLowerCase(locale);
            }
            Iterator<ys> it = entry.getValue().iterator();
            while (it.hasNext()) {
                String strB = it.next().b();
                if (z) {
                    strB = strB.toLowerCase(locale);
                }
                map2.put(strB, key);
            }
        }
        return map2;
    }
}
