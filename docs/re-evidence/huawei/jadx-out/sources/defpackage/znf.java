package defpackage;

import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectInstance;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B¦\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012U\u0010\u0006\u001aQ\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0004\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007j\u0002`\u000e\u0012U\u0010\u000f\u001aQ\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007j\u0002`\u0011\u0012i\b\u0002\u0010\u0012\u001ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0013\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u0014\u0018\u00010\u0007j\u0004\u0018\u0001`\u0016¢\u0006\u0002\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019Ru\u0010\u0012\u001ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0013\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u0014\u0018\u00010\u0007j\u0004\u0018\u0001`\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bRc\u0010\u000f\u001aQ\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007j\u0002`\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bRc\u0010\u0006\u001aQ\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0004\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007j\u0002`\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001b¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/selects/SelectClause2Impl;", "P", "Q", "Lkotlinx/coroutines/selects/SelectClause2;", "clauseObject", "", "regFunc", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/selects/SelectInstance;", "select", RemoteMessageConst.MessageBody.PARAM, "", "Lkotlinx/coroutines/selects/RegistrationFunction;", "processResFunc", "clauseResult", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "onCancellationConstructor", "internalResult", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;)V", "getClauseObject", "()Ljava/lang/Object;", "getOnCancellationConstructor", "()Lkotlin/jvm/functions/Function3;", "getProcessResFunc", "getRegFunc", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class znf<P, Q> implements SelectClause2<P, Q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function3<SelectInstance<?>, Object, Object, Function1<Throwable, yzc>> f54341a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f54342c;
    private final Function3<Object, SelectInstance<?>, Object, yzc> d;
    private final Function3<Object, Object, Object, Object> e;

    /* JADX WARN: Multi-variable type inference failed */
    public znf(Object obj, Function3<Object, ? super SelectInstance<?>, Object, yzc> function3, Function3<Object, Object, Object, ? extends Object> function4, Function3<? super SelectInstance<?>, Object, Object, ? extends Function1<? super Throwable, yzc>> function5) {
        this.f54342c = obj;
        this.d = function3;
        this.e = function4;
        this.f54341a = function5;
    }

    public /* synthetic */ znf(Object obj, Function3 function3, Function3 function4, Function3 function5, int i, zcm zcmVar) {
        this(obj, function3, function4, (i & 8) != 0 ? null : function5);
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    /* JADX INFO: renamed from: getClauseObject, reason: from getter */
    public Object getF54342c() {
        return this.f54342c;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public Function3<Object, SelectInstance<?>, Object, yzc> getRegFunc() {
        return this.d;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public Function3<Object, Object, Object, Object> getProcessResFunc() {
        return this.e;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public Function3<SelectInstance<?>, Object, Object, Function1<Throwable, yzc>> getOnCancellationConstructor() {
        return this.f54341a;
    }
}
