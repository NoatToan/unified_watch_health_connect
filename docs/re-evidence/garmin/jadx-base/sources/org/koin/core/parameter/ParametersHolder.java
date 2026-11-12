package org.koin.core.parameter;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.List;
import k23.d;
import org.koin.core.error.NoParameterFoundException;
import org.koin.core.module.KoinDslMarker;
import org.koin.ext.KClassExtKt;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.x;

/* JADX INFO: loaded from: classes3.dex */
@KoinDslMarker
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0002¢\u0006\u0004\b\r\u0010\fJ)\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00028\u0000\"\u0006\b\u0000\u0010\b\u0018\u0001H\u0086\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00028\u0000\"\u0006\b\u0000\u0010\b\u0018\u0001H\u0086\n¢\u0006\u0004\b\u0014\u0010\u0013J\u0018\u0010\u0015\u001a\u00028\u0000\"\u0006\b\u0000\u0010\b\u0018\u0001H\u0086\n¢\u0006\u0004\b\u0015\u0010\u0013J\u0018\u0010\u0016\u001a\u00028\u0000\"\u0006\b\u0000\u0010\b\u0018\u0001H\u0086\n¢\u0006\u0004\b\u0016\u0010\u0013J\u0018\u0010\u0017\u001a\u00028\u0000\"\u0006\b\u0000\u0010\b\u0018\u0001H\u0086\n¢\u0006\u0004\b\u0017\u0010\u0013J\u001e\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001c\u001a\u00020\u001b\"\u0004\b\u0000\u0010\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0004¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010!J\u001d\u0010%\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u0001¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0001¢\u0006\u0004\b'\u0010(J\u001c\u0010\u0018\u001a\u00028\u0000\"\n\b\u0000\u0010\b\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0018\u0010\u0013J\u001e\u0010)\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\b\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b)\u0010\u0013J#\u0010)\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b)\u0010\fJ\u000f\u0010*\u001a\u00020\u001bH\u0001¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.R(\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010/\u0012\u0004\b2\u0010+\u001a\u0004\b0\u00101R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u00105R\"\u0010#\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u00106\u001a\u0004\b7\u0010\u001f\"\u0004\b8\u00109R\u0019\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010:8F¢\u0006\u0006\u001a\u0004\b;\u00101¨\u0006="}, d2 = {"Lorg/koin/core/parameter/ParametersHolder;", "", "", "_values", "", "useIndexedValues", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;)V", "T", "Lk23/d;", "clazz", "getFirstValue", "(Lk23/d;)Ljava/lang/Object;", "getIndexedValue", "", IntegerTokenConverter.CONVERTER_KEY, "elementAt", "(ILk23/d;)Ljava/lang/Object;", "component1", "()Ljava/lang/Object;", "component2", "component3", "component4", "component5", "get", "(I)Ljava/lang/Object;", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "", "set", "(ILjava/lang/Object;)V", "size", "()I", "isEmpty", "()Z", "isNotEmpty", FirebaseAnalytics.Param.INDEX, "value", "insert", "(ILjava/lang/Object;)Lorg/koin/core/parameter/ParametersHolder;", "add", "(Ljava/lang/Object;)Lorg/koin/core/parameter/ParametersHolder;", "getOrNull", "increaseIndex", "()V", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "get_values", "()Ljava/util/List;", "get_values$annotations", "Ljava/lang/Boolean;", "getUseIndexedValues", "()Ljava/lang/Boolean;", "I", "getIndex", "setIndex", "(I)V", "", "getValues", "values", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ParametersHolder {
    private final List<Object> _values;
    private int index;
    private final Boolean useIndexedValues;

    public /* synthetic */ ParametersHolder(List list, Boolean bool, int i14, j jVar) {
        this((i14 & 1) != 0 ? new ArrayList() : list, (i14 & 2) != 0 ? null : bool);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x001c A[RETURN] */
    private final <T> T getFirstValue(d<?> clazz) {
        for (T t7 : this._values) {
            if (clazz.q(t7)) {
                if (t7 == null) {
                    return null;
                }
                return t7;
            }
        }
        t7 = null;
        if (t7 == null) {
            return null;
        }
        return t7;
    }

    private final <T> T getIndexedValue(d<?> clazz) {
        Object obj = this._values.get(this.index);
        T t7 = null;
        if (!clazz.q(obj)) {
            obj = null;
        }
        if (obj != null) {
            t7 = (T) obj;
        }
        if (t7 != null) {
            increaseIndex();
        }
        return t7;
    }

    public static /* synthetic */ void get_values$annotations() {
    }

    public final ParametersHolder add(Object value) {
        value.getClass();
        this._values.add(value);
        return this;
    }

    public final <T> T component1() {
        s.l();
        throw null;
    }

    public final <T> T component2() {
        s.l();
        throw null;
    }

    public final <T> T component3() {
        s.l();
        throw null;
    }

    public final <T> T component4() {
        s.l();
        throw null;
    }

    public final <T> T component5() {
        s.l();
        throw null;
    }

    public <T> T elementAt(int i14, d<?> clazz) throws NoParameterFoundException {
        clazz.getClass();
        if (i14 < this._values.size()) {
            return (T) this._values.get(i14);
        }
        StringBuilder sb3 = new StringBuilder("Can't get injected parameter #");
        sb3.append(i14);
        sb3.append(" from ");
        sb3.append(this);
        String fullName = KClassExtKt.getFullName(clazz);
        sb3.append(" for type '");
        sb3.append(fullName);
        sb3.append(CoreConstants.SINGLE_QUOTE_CHAR);
        throw new NoParameterFoundException(sb3.toString());
    }

    public final <T> T get(int i14) {
        return (T) this._values.get(i14);
    }

    public final int getIndex() {
        return this.index;
    }

    public <T> T getOrNull(d<?> clazz) {
        clazz.getClass();
        if (this._values.isEmpty()) {
            return null;
        }
        Boolean bool = this.useIndexedValues;
        if (bool != null) {
            return bool.equals(Boolean.TRUE) ? (T) getIndexedValue(clazz) : (T) getFirstValue(clazz);
        }
        T t7 = (T) getIndexedValue(clazz);
        return t7 == null ? (T) getFirstValue(clazz) : t7;
    }

    public final Boolean getUseIndexedValues() {
        return this.useIndexedValues;
    }

    public final List<Object> getValues() {
        return this._values;
    }

    public final List<Object> get_values() {
        return this._values;
    }

    public final void increaseIndex() {
        if (this.index < x.j(this._values)) {
            this.index++;
        }
    }

    public final ParametersHolder insert(int index, Object value) {
        value.getClass();
        this._values.add(index, value);
        return this;
    }

    public final boolean isEmpty() {
        return this._values.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !this._values.isEmpty();
    }

    public final <T> void set(int i14, T t7) {
        List<Object> list = this._values;
        t7.getClass();
        list.set(i14, t7);
    }

    public final void setIndex(int i14) {
        this.index = i14;
    }

    public final int size() {
        return this._values.size();
    }

    public String toString() {
        return "DefinitionParameters" + h0.b1(this._values);
    }

    public final <T> T get() {
        s.l();
        throw null;
    }

    public ParametersHolder(List<Object> list, Boolean bool) {
        list.getClass();
        this._values = list;
        this.useIndexedValues = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ParametersHolder() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final <T> T getOrNull() {
        s.l();
        throw null;
    }
}
