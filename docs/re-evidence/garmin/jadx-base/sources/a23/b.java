package a23;

import c53.j;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import e23.l;
import e23.p;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.io.AccessDeniedException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0013\u0014\u0015Bm\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u001b\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0012¨\u0006\u0016"}, d2 = {"La23/b;", "Lc53/j;", "Ljava/io/File;", TtmlNode.START, "La23/c;", "direction", "Lkotlin/Function1;", "", "onEnter", "", "onLeave", "Lkotlin/Function2;", "Ljava/io/IOException;", "onFail", "", "maxDepth", "<init>", "(Ljava/io/File;La23/c;Le23/l;Le23/l;Le23/p;I)V", "(Ljava/io/File;La23/c;)V", "c", "a", "b", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements j<File> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a23.c f575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l<File, Boolean> f576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l<File, Unit> f577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p<File, IOException, Unit> f578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f579f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La23/b$a;", "La23/b$c;", "Ljava/io/File;", "rootDir", "<init>", "(Ljava/io/File;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File file) {
            super(file);
            file.getClass();
        }
    }

    /* JADX INFO: renamed from: a23.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"La23/b$b;", "Lp13/b;", "Ljava/io/File;", "<init>", "(La23/b;)V", "a", "c", "b", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class C0006b extends p13.b<File> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayDeque<c> f580c;

        /* JADX INFO: renamed from: a23.b$b$a */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La23/b$b$a;", "La23/b$a;", "Ljava/io/File;", "rootDir", "<init>", "(La23/b$b;Ljava/io/File;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class a extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f582b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public File[] f583c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f584d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f585e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ C0006b f586f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0006b c0006b, File file) {
                super(file);
                file.getClass();
                this.f586f = c0006b;
            }

            /* JADX WARN: Code duplicated, block: B:25:0x0057  */
            /* JADX WARN: Code duplicated, block: B:27:0x005a  */
            /* JADX WARN: Code duplicated, block: B:29:0x0060  */
            @Override // a23.b.c
            public final File a() {
                File[] fileArr;
                l<File, Unit> lVar;
                boolean z14 = this.f585e;
                C0006b c0006b = this.f586f;
                File file = this.f593a;
                if (z14 || this.f583c != null) {
                    fileArr = this.f583c;
                    if (fileArr == null && this.f584d < fileArr.length) {
                        fileArr.getClass();
                        int i14 = this.f584d;
                        this.f584d = i14 + 1;
                        return fileArr[i14];
                    }
                    if (!this.f582b) {
                        this.f582b = true;
                        return file;
                    }
                    lVar = b.this.f577d;
                    if (lVar != null) {
                        lVar.invoke(file);
                    }
                } else {
                    l<File, Boolean> lVar2 = b.this.f576c;
                    if (lVar2 == null || lVar2.invoke(file).booleanValue()) {
                        File[] fileArrListFiles = file.listFiles();
                        this.f583c = fileArrListFiles;
                        if (fileArrListFiles == null) {
                            p<File, IOException, Unit> pVar = b.this.f578e;
                            if (pVar != null) {
                                pVar.invoke(file, new AccessDeniedException(file, null, "Cannot list files in a directory", 2, null));
                            }
                            this.f585e = true;
                        }
                        fileArr = this.f583c;
                        if (fileArr == null) {
                        }
                        if (!this.f582b) {
                            this.f582b = true;
                            return file;
                        }
                        lVar = b.this.f577d;
                        if (lVar != null) {
                            lVar.invoke(file);
                        }
                    }
                }
                return null;
            }
        }

        /* JADX INFO: renamed from: a23.b$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La23/b$b$b;", "La23/b$c;", "Ljava/io/File;", "rootFile", "<init>", "(La23/b$b;Ljava/io/File;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class C0007b extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f587b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0007b(C0006b c0006b, File file) {
                super(file);
                file.getClass();
            }

            @Override // a23.b.c
            public final File a() {
                if (this.f587b) {
                    return null;
                }
                this.f587b = true;
                return this.f593a;
            }
        }

        /* JADX INFO: renamed from: a23.b$b$c */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La23/b$b$c;", "La23/b$a;", "Ljava/io/File;", "rootDir", "<init>", "(La23/b$b;Ljava/io/File;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class c extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f588b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public File[] f589c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f590d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ C0006b f591e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(C0006b c0006b, File file) {
                super(file);
                file.getClass();
                this.f591e = c0006b;
            }

            @Override // a23.b.c
            public final File a() {
                p<File, IOException, Unit> pVar;
                boolean z14 = this.f588b;
                C0006b c0006b = this.f591e;
                File file = this.f593a;
                if (z14) {
                    File[] fileArr = this.f589c;
                    if (fileArr == null || this.f590d < fileArr.length) {
                        if (fileArr == null) {
                            File[] fileArrListFiles = file.listFiles();
                            this.f589c = fileArrListFiles;
                            if (fileArrListFiles == null && (pVar = b.this.f578e) != null) {
                                pVar.invoke(file, new AccessDeniedException(file, null, "Cannot list files in a directory", 2, null));
                            }
                            File[] fileArr2 = this.f589c;
                            if (fileArr2 == null || fileArr2.length == 0) {
                                l<File, Unit> lVar = b.this.f577d;
                                if (lVar != null) {
                                    lVar.invoke(file);
                                }
                            }
                        }
                        File[] fileArr3 = this.f589c;
                        fileArr3.getClass();
                        int i14 = this.f590d;
                        this.f590d = i14 + 1;
                        return fileArr3[i14];
                    }
                    l<File, Unit> lVar2 = b.this.f577d;
                    if (lVar2 != null) {
                        lVar2.invoke(file);
                        return null;
                    }
                } else {
                    l<File, Boolean> lVar3 = b.this.f576c;
                    if (lVar3 == null || lVar3.invoke(file).booleanValue()) {
                        this.f588b = true;
                        return file;
                    }
                }
                return null;
            }
        }

        /* JADX INFO: renamed from: a23.b$b$d */
        public static final /* synthetic */ class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f592a;

            static {
                int[] iArr = new int[a23.c.values().length];
                try {
                    iArr[a23.c.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a23.c.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f592a = iArr;
            }
        }

        public C0006b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.f580c = arrayDeque;
            if (b.this.f574a.isDirectory()) {
                arrayDeque.push(b(b.this.f574a));
            } else if (b.this.f574a.isFile()) {
                arrayDeque.push(new C0007b(this, b.this.f574a));
            } else {
                this.f134914a = 2;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p13.b
        public final void a() {
            T t7;
            while (true) {
                ArrayDeque<c> arrayDeque = this.f580c;
                c cVarPeek = arrayDeque.peek();
                if (cVarPeek == null) {
                    t7 = 0;
                    break;
                }
                File fileA = cVarPeek.a();
                if (fileA == null) {
                    arrayDeque.pop();
                } else {
                    if (fileA.equals(cVarPeek.f593a) || !fileA.isDirectory() || arrayDeque.size() >= b.this.f579f) {
                        t7 = fileA;
                        break;
                    }
                    arrayDeque.push(b(fileA));
                }
            }
            if (t7 == 0) {
                this.f134914a = 2;
            } else {
                this.f134915b = t7;
                this.f134914a = 1;
            }
        }

        public final a b(File file) {
            int i14 = d.f592a[b.this.f575b.ordinal()];
            if (i14 == 1) {
                return new c(this, file);
            }
            if (i14 == 2) {
                return new a(this, file);
            }
            u0.r();
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La23/b$c;", "", "Ljava/io/File;", "root", "<init>", "(Ljava/io/File;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f593a;

        public c(File file) {
            file.getClass();
            this.f593a = file;
        }

        public abstract File a();
    }

    public /* synthetic */ b(File file, a23.c cVar, l lVar, l lVar2, p pVar, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(file, (i15 & 2) != 0 ? a23.c.TOP_DOWN : cVar, lVar, lVar2, pVar, (i15 & 32) != 0 ? Integer.MAX_VALUE : i14);
    }

    @Override // c53.j
    public final Iterator<File> iterator() {
        return new C0006b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b(File file, a23.c cVar, l<? super File, Boolean> lVar, l<? super File, Unit> lVar2, p<? super File, ? super IOException, Unit> pVar, int i14) {
        this.f574a = file;
        this.f575b = cVar;
        this.f576c = lVar;
        this.f577d = lVar2;
        this.f578e = pVar;
        this.f579f = i14;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(File file, a23.c cVar) {
        this(file, cVar, null, null, null, 0, 32, null);
        file.getClass();
        cVar.getClass();
    }

    public /* synthetic */ b(File file, a23.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(file, (i14 & 2) != 0 ? a23.c.TOP_DOWN : cVar);
    }
}
