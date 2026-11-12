package org.junit.rules;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.runners.model.MultipleFailureException;

/* JADX INFO: loaded from: classes23.dex */
public class ErrorCollector extends Verifier {
    private List<Throwable> a = new ArrayList();

    public class a implements Callable<Object> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Object b;
        public final /* synthetic */ Matcher c;

        public a(String str, Object obj, Matcher matcher) {
            this.a = str;
            this.b = obj;
            this.c = matcher;
        }

        @Override // java.util.concurrent.Callable
        public Object call() throws Exception {
            Assert.assertThat(this.a, this.b, this.c);
            return this.b;
        }
    }

    public void addError(Throwable th) {
        this.a.add(th);
    }

    public <T> T checkSucceeds(Callable<T> callable) {
        try {
            return callable.call();
        } catch (Throwable th) {
            addError(th);
            return null;
        }
    }

    public <T> void checkThat(T t, Matcher<T> matcher) {
        checkThat("", t, matcher);
    }

    @Override // org.junit.rules.Verifier
    public void verify() throws Exception {
        MultipleFailureException.assertEmpty(this.a);
    }

    public <T> void checkThat(String str, T t, Matcher<T> matcher) {
        checkSucceeds(new a(str, t, matcher));
    }
}
