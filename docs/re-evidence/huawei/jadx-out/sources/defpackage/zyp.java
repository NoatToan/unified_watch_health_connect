package defpackage;

import java.lang.Enum;
import java.util.Arrays;
import java.util.List;
import org.eclipse.californium.elements.config.BasicDefinition;

/* JADX INFO: loaded from: classes20.dex */
public class zyp<E extends Enum<?>> extends BasicDefinition<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E f54783a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<E> f54784c;
    private final String e;

    public zyp(String str, String str2, E... eArr) {
        super(str, str2, zyn.a(eArr), null);
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
        E e2 = eArr[0];
        for (int i = 1; i < eArr.length; i++) {
            if (eArr[i].equals(e2)) {
                this.f54783a = e2;
                this.f54784c = Arrays.asList(Arrays.copyOfRange(eArr, 1, eArr.length));
                this.e = zyn.c(Arrays.asList(eArr), true);
            }
        }
        this.f54783a = null;
        this.f54784c = Arrays.asList(Arrays.copyOf(eArr, eArr.length));
        this.e = zyn.c(Arrays.asList(eArr), true);
    }

    public zyp(String str, String str2, E e, E[] eArr) {
        super(str, str2, zyn.a(eArr), null);
        if (eArr == null) {
            throw new NullPointerException("Enum set must not be null!");
        }
        if (eArr.length == 0) {
            throw new IllegalArgumentException("Enum set must not be empty!");
        }
        for (E e2 : eArr) {
            if (e2 == null) {
                throw new IllegalArgumentException("Enum set must not contain null!");
            }
        }
        this.f54783a = e;
        List<E> listAsList = Arrays.asList(Arrays.copyOf(eArr, eArr.length));
        this.f54784c = listAsList;
        this.e = zyn.c(listAsList, true);
        if (e != null) {
            isAssignableFrom(e);
        }
    }

    @Override // org.eclipse.californium.elements.config.DocumentedDefinition
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String writeValue(E e) {
        return e.name();
    }

    @Override // org.eclipse.californium.elements.config.DocumentedDefinition
    public String getDocumentation() {
        return super.getDocumentation() + "\n" + this.e + ".";
    }

    @Override // org.eclipse.californium.elements.config.DocumentedDefinition
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public E getDefaultValue() {
        return this.f54783a;
    }

    @Override // org.eclipse.californium.elements.config.DocumentedDefinition
    public boolean isAssignableFrom(Object obj) {
        if (this.f54784c.contains(obj)) {
            return true;
        }
        if (!super.isAssignableFrom(obj)) {
            return false;
        }
        throw new IllegalArgumentException(obj + " is not in " + this.e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.eclipse.californium.elements.config.DocumentedDefinition
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public E parseValue(String str) throws zyw {
        E e = (E) zyn.d(str, this.f54784c);
        if (e != null) {
            return e;
        }
        throw new zyw(str + " is not in " + this.e);
    }
}
