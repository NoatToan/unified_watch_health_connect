package pl2;

import com.google.common.base.Function;
import java.util.concurrent.TimeoutException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class h<F, T> implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h<F, T> f138582a = new h<>();

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) throws TimeoutException {
        throw new TimeoutException("the device did not respond within 5000 milliseconds");
    }
}
