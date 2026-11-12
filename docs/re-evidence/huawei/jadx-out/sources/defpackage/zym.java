package defpackage;

import com.huawei.hihealth.HiDataFilter;
import java.lang.Enum;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.californium.elements.config.BasicListDefinition;

/* JADX INFO: loaded from: classes20.dex */
public class zym<E extends Enum<?>> extends BasicListDefinition<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f54777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<E> f54778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<E> f54779c;
    private final Class<E> d;
    private final String e;
    private final String g;

    public zym(String str, String str2, E[] eArr) {
        this(str, str2, null, 0, eArr);
    }

    public zym(String str, String str2, List<E> list, E[] eArr) {
        this(str, str2, list, 0, eArr);
    }

    public zym(String str, String str2, List<E> list, int i, E[] eArr) {
        super(str, str2, null);
        if (eArr == null) {
            throw new NullPointerException("Enum set must not be null!");
        }
        if (eArr.length == 0) {
            throw new IllegalArgumentException("Enum set must not be empty!");
        }
        for (E e : eArr) {
            if (e == null) {
                throw new IllegalArgumentException("Enum set must not contain null!");
            }
        }
        Class<E> cls = (Class<E>) eArr[0].getClass();
        this.d = cls;
        this.e = "List<" + cls.getSimpleName() + HiDataFilter.DataFilterExpression.BIGGER_THAN;
        List<E> listAsList = Arrays.asList(Arrays.copyOf(eArr, eArr.length));
        this.f54778b = listAsList;
        this.g = zyn.c(listAsList, true);
        this.f54777a = i;
        try {
            this.f54779c = checkValue((List) list);
        } catch (zyw e2) {
            throw new IllegalArgumentException(e2.getMessage());
        }
    }

    @Override // org.eclipse.californium.elements.config.DocumentedDefinition
    public String getTypeName() {
        return this.e;
    }

    @Override // org.eclipse.californium.elements.config.DocumentedDefinition
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String writeValue(List<E> list) {
        return zyn.c(list, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.eclipse.californium.elements.config.BasicListDefinition, org.eclipse.californium.elements.config.DocumentedDefinition
    public List<E> checkValue(List<E> list) throws zyw {
        if (list != 0) {
            if (list.size() < this.f54777a) {
                if (list.isEmpty()) {
                    throw new zyw("Values must not be empty!");
                }
                throw new zyw("Values with " + list.size() + " items must not contain less items than " + this.f54777a + "!");
            }
            for (E e : list) {
                if (!this.f54778b.contains(e)) {
                    if (this.d.isInstance(e)) {
                        throw new IllegalArgumentException(e + " is not in " + this.g);
                    }
                    throw new IllegalArgumentException(e + " is no " + this.d.getSimpleName());
                }
            }
        }
        return super.checkValue((List) list);
    }

    @Override // org.eclipse.californium.elements.config.DocumentedDefinition
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public List<E> getDefaultValue() {
        return this.f54779c;
    }

    @Override // org.eclipse.californium.elements.config.DocumentedDefinition
    public String getDocumentation() {
        return super.getDocumentation() + "\nList of " + this.g + ".";
    }

    @Override // org.eclipse.californium.elements.config.DocumentedDefinition
    public boolean isAssignableFrom(Object obj) {
        if (!(obj instanceof List)) {
            return false;
        }
        for (Object obj2 : (List) obj) {
            if (!this.d.isInstance(obj2)) {
                throw new IllegalArgumentException(obj2 + " is no " + this.d.getSimpleName());
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.eclipse.californium.elements.config.DocumentedDefinition
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public List<E> parseValue(String str) throws zyw {
        String[] strArrSplit = str.split(",");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str2 : strArrSplit) {
            String strTrim = str2.trim();
            Enum enumD = zyn.d(strTrim, this.f54778b);
            if (enumD == null) {
                throw new zyw(strTrim + " is not in " + this.g);
            }
            arrayList.add(enumD);
        }
        return arrayList;
    }
}
