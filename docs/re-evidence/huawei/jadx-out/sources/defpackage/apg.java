package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.io.ElementTypesAreNonnullByDefault;
import com.google.common.io.LineBuffer;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class apg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharBuffer f652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LineBuffer f653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final char[] f654c;
    private final Queue<String> d;
    private final Readable e;

    @CheckForNull
    private final Reader i;

    public apg(Readable readable) {
        CharBuffer charBufferA = apc.a();
        this.f652a = charBufferA;
        this.f654c = charBufferA.array();
        this.d = new ArrayDeque();
        this.f653b = new LineBuffer() { // from class: apg.1
            @Override // com.google.common.io.LineBuffer
            public void handleLine(String str, String str2) {
                apg.this.d.add(str);
            }
        };
        this.e = (Readable) Preconditions.checkNotNull(readable);
        this.i = readable instanceof Reader ? (Reader) readable : null;
    }

    @CheckForNull
    public String c() throws IOException {
        int i;
        while (this.d.peek() == null) {
            apd.d(this.f652a);
            Reader reader = this.i;
            if (reader != null) {
                char[] cArr = this.f654c;
                i = reader.read(cArr, 0, cArr.length);
            } else {
                i = this.e.read(this.f652a);
            }
            if (i == -1) {
                this.f653b.finish();
                break;
            }
            this.f653b.add(this.f654c, 0, i);
        }
        return this.d.poll();
    }
}
