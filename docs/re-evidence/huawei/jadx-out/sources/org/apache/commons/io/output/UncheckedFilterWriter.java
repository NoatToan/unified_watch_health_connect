package org.apache.commons.io.output;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Writer;
import org.apache.commons.io.build.AbstractStreamBuilder;
import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.function.IOFunction;
import org.apache.commons.io.function.IORunnable;
import org.apache.commons.io.function.IOTriConsumer;
import org.apache.commons.io.function.IOTriFunction;
import org.apache.commons.io.function.Uncheck;

/* JADX INFO: loaded from: classes46.dex */
public final class UncheckedFilterWriter extends FilterWriter {

    public static class Builder extends AbstractStreamBuilder<UncheckedFilterWriter, Builder> {
        @Override // org.apache.commons.io.function.IOSupplier
        public UncheckedFilterWriter get() throws IOException {
            return new UncheckedFilterWriter(getWriter());
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private UncheckedFilterWriter(Writer writer) {
        super(writer);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c2) throws UncheckedIOException {
        return (Writer) Uncheck.apply(new IOFunction() { // from class: org.apache.commons.io.output.UncheckedFilterWriter$$ExternalSyntheticLambda1
            @Override // org.apache.commons.io.function.IOFunction
            public final Object apply(Object obj) {
                return this.f$0.m2275xc7671afa(((Character) obj).charValue());
            }
        }, Character.valueOf(c2));
    }

    /* JADX INFO: renamed from: lambda$append$0$org-apache-commons-io-output-UncheckedFilterWriter, reason: not valid java name */
    /* synthetic */ Writer m2275xc7671afa(char c2) throws IOException {
        return super.append(c2);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) throws UncheckedIOException {
        return (Writer) Uncheck.apply(new IOFunction() { // from class: org.apache.commons.io.output.UncheckedFilterWriter$$ExternalSyntheticLambda0
            @Override // org.apache.commons.io.function.IOFunction
            public final Object apply(Object obj) {
                return this.f$0.m2276xf53fb559((CharSequence) obj);
            }
        }, charSequence);
    }

    /* JADX INFO: renamed from: lambda$append$1$org-apache-commons-io-output-UncheckedFilterWriter, reason: not valid java name */
    /* synthetic */ Writer m2276xf53fb559(CharSequence charSequence) throws IOException {
        return super.append(charSequence);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) throws UncheckedIOException {
        return (Writer) Uncheck.apply(new IOTriFunction() { // from class: org.apache.commons.io.output.UncheckedFilterWriter$$ExternalSyntheticLambda5
            @Override // org.apache.commons.io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                return this.f$0.m2277x23184fb8((CharSequence) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        }, charSequence, Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: lambda$append$2$org-apache-commons-io-output-UncheckedFilterWriter, reason: not valid java name */
    /* synthetic */ Writer m2277x23184fb8(CharSequence charSequence, int i, int i2) throws IOException {
        return super.append(charSequence, i, i2);
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws UncheckedIOException {
        Uncheck.run(new IORunnable() { // from class: org.apache.commons.io.output.UncheckedFilterWriter$$ExternalSyntheticLambda6
            @Override // org.apache.commons.io.function.IORunnable
            public final void run() throws IOException {
                this.f$0.m2278x17bbe853();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$close$3$org-apache-commons-io-output-UncheckedFilterWriter, reason: not valid java name */
    /* synthetic */ void m2278x17bbe853() throws IOException {
        super.close();
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Flushable
    public void flush() throws UncheckedIOException {
        Uncheck.run(new IORunnable() { // from class: org.apache.commons.io.output.UncheckedFilterWriter$$ExternalSyntheticLambda4
            @Override // org.apache.commons.io.function.IORunnable
            public final void run() throws IOException {
                this.f$0.m2279x41f43526();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$flush$4$org-apache-commons-io-output-UncheckedFilterWriter, reason: not valid java name */
    /* synthetic */ void m2279x41f43526() throws IOException {
        super.flush();
    }

    /* JADX INFO: renamed from: lambda$write$5$org-apache-commons-io-output-UncheckedFilterWriter, reason: not valid java name */
    /* synthetic */ void m2280x7979858a(char[] cArr) throws IOException {
        super.write(cArr);
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws UncheckedIOException {
        Uncheck.accept(new IOConsumer() { // from class: org.apache.commons.io.output.UncheckedFilterWriter$$ExternalSyntheticLambda7
            @Override // org.apache.commons.io.function.IOConsumer
            public final void accept(Object obj) throws IOException {
                this.f$0.m2280x7979858a((char[]) obj);
            }
        }, cArr);
    }

    /* JADX INFO: renamed from: lambda$write$6$org-apache-commons-io-output-UncheckedFilterWriter, reason: not valid java name */
    /* synthetic */ void m2281xa7521fe9(char[] cArr, int i, int i2) throws IOException {
        super.write(cArr, i, i2);
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(char[] cArr, int i, int i2) throws UncheckedIOException {
        Uncheck.accept(new IOTriConsumer() { // from class: org.apache.commons.io.output.UncheckedFilterWriter$$ExternalSyntheticLambda3
            @Override // org.apache.commons.io.function.IOTriConsumer
            public final void accept(Object obj, Object obj2, Object obj3) throws IOException {
                this.f$0.m2281xa7521fe9((char[]) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        }, cArr, Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: lambda$write$7$org-apache-commons-io-output-UncheckedFilterWriter, reason: not valid java name */
    /* synthetic */ void m2282xd52aba48(int i) throws IOException {
        super.write(i);
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(int i) throws UncheckedIOException {
        Uncheck.accept(new IOConsumer() { // from class: org.apache.commons.io.output.UncheckedFilterWriter$$ExternalSyntheticLambda9
            @Override // org.apache.commons.io.function.IOConsumer
            public final void accept(Object obj) throws IOException {
                this.f$0.m2282xd52aba48(((Integer) obj).intValue());
            }
        }, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: lambda$write$8$org-apache-commons-io-output-UncheckedFilterWriter, reason: not valid java name */
    /* synthetic */ void m2283x30354a7(String str) throws IOException {
        super.write(str);
    }

    @Override // java.io.Writer
    public void write(String str) throws UncheckedIOException {
        Uncheck.accept(new IOConsumer() { // from class: org.apache.commons.io.output.UncheckedFilterWriter$$ExternalSyntheticLambda8
            @Override // org.apache.commons.io.function.IOConsumer
            public final void accept(Object obj) throws IOException {
                this.f$0.m2283x30354a7((String) obj);
            }
        }, str);
    }

    /* JADX INFO: renamed from: lambda$write$9$org-apache-commons-io-output-UncheckedFilterWriter, reason: not valid java name */
    /* synthetic */ void m2284x30dbef06(String str, int i, int i2) throws IOException {
        super.write(str, i, i2);
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(String str, int i, int i2) throws UncheckedIOException {
        Uncheck.accept(new IOTriConsumer() { // from class: org.apache.commons.io.output.UncheckedFilterWriter$$ExternalSyntheticLambda2
            @Override // org.apache.commons.io.function.IOTriConsumer
            public final void accept(Object obj, Object obj2, Object obj3) throws IOException {
                this.f$0.m2284x30dbef06((String) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        }, str, Integer.valueOf(i), Integer.valueOf(i2));
    }
}
