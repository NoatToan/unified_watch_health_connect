package cn.hutool.core.text.csv;

import cn.hutool.core.io.IORuntimeException;
import cn.hutool.core.text.StrBuilder;
import cn.hutool.core.text.csv.CsvParser;
import defpackage.b55;
import defpackage.g4h;
import defpackage.tt3;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
public final class CsvParser implements Closeable, Serializable {
    private static final int DEFAULT_ROW_CAPACITY = 10;
    private static final long serialVersionUID = 1;
    private final CsvReadConfig config;
    private boolean finished;
    private b55 header;
    private boolean inQuotes;
    private long inQuotesLineCount;
    private int maxFieldCount;
    private final Reader reader;
    private final a buf = new a(32768);
    private int preChar = -1;
    private final StrBuilder currentField = new StrBuilder(512);
    private long lineNo = -1;
    private int firstLineFieldCount = -1;

    public static class a implements Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final char[] f5560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5561b;
        public int c;
        public int d;

        public a(int i) {
            this.f5560a = new char[i];
        }

        public void a(StrBuilder strBuilder, int i) {
            strBuilder.append(this.f5560a, this.f5561b, i);
        }

        public char b() {
            char[] cArr = this.f5560a;
            int i = this.c;
            this.c = i + 1;
            return cArr[i];
        }

        public final boolean c() {
            return this.c < this.d;
        }

        public void d() {
            this.f5561b = this.c;
        }

        public int e(Reader reader) {
            try {
                int i = reader.read(this.f5560a);
                this.f5561b = 0;
                this.c = 0;
                this.d = i;
                return i;
            } catch (IOException e) {
                throw new IORuntimeException(e);
            }
        }
    }

    public CsvParser(Reader reader, CsvReadConfig csvReadConfig) {
        Objects.requireNonNull(reader, "reader must not be null");
        this.reader = reader;
        this.config = (CsvReadConfig) g4h.e(csvReadConfig, CsvReadConfig.defaultConfig());
    }

    private void addField(List<String> list, String str) {
        char c = this.config.textDelimiter;
        list.add(tt3.W(tt3.v0(tt3.t0(str, 1, new Predicate() { // from class: a55
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return CsvParser.lambda$addField$0((Character) obj);
            }
        }), c), "" + c + c, c + ""));
    }

    private void initHeader(List<String> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(list.size());
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (tt3.I(str) && !linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, Integer.valueOf(i));
            }
        }
        this.header = new b55(this.lineNo, Collections.unmodifiableMap(linkedHashMap), Collections.unmodifiableList(list));
    }

    private boolean isLineEnd(char c) {
        return (c == '\r' || c == '\n') && this.preChar != 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$addField$0(Character ch) {
        return ch.charValue() == '\n' || ch.charValue() == '\r';
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0081  */
    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:42:0x008a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0092  */
    /* JADX WARN: Code duplicated, block: B:46:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x009a  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00de  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c6 A[SYNTHETIC] */
    private List<String> readLine() throws IORuntimeException {
        char cB;
        CsvReadConfig csvReadConfig;
        long j = this.inQuotesLineCount;
        if (j > 0) {
            this.lineNo += j;
            this.inQuotesLineCount = 0L;
        }
        int i = this.maxFieldCount;
        if (i <= 0) {
            i = 10;
        }
        ArrayList arrayList = new ArrayList(i);
        StrBuilder strBuilder = this.currentField;
        a aVar = this.buf;
        int i2 = this.preChar;
        int i3 = 0;
        boolean z = false;
        while (true) {
            if (aVar.c()) {
                cB = aVar.b();
                if ((i2 >= 0 || i2 == 13 || i2 == 10) && cB == this.config.commentCharacter) {
                }
                if (z) {
                    if (cB != '\r' || cB == '\n') {
                        this.lineNo++;
                        z = false;
                    }
                    aVar.d();
                } else {
                    if (this.inQuotes) {
                        csvReadConfig = this.config;
                        if (cB == csvReadConfig.fieldSeparator) {
                            if (cB == csvReadConfig.textDelimiter) {
                                if (cB == '\r') {
                                    if (i3 > 0) {
                                        aVar.a(strBuilder, i3);
                                    }
                                    aVar.d();
                                    addField(arrayList, strBuilder.toStringAndReset());
                                } else if (cB == '\n') {
                                    if (i2 != 13) {
                                        if (i3 > 0) {
                                            aVar.a(strBuilder, i3);
                                        }
                                        aVar.d();
                                        addField(arrayList, strBuilder.toStringAndReset());
                                    } else {
                                        aVar.d();
                                    }
                                }
                                i2 = cB;
                                break;
                            }
                            this.inQuotes = true;
                        } else {
                            if (i3 > 0) {
                                aVar.a(strBuilder, i3);
                                i3 = 0;
                            }
                            aVar.d();
                            addField(arrayList, strBuilder.toStringAndReset());
                        }
                    } else if (cB == this.config.textDelimiter) {
                        this.inQuotes = false;
                    } else if (isLineEnd(cB)) {
                        this.inQuotesLineCount++;
                    }
                    i3++;
                }
                i2 = cB;
            } else {
                if (i3 > 0) {
                    aVar.a(strBuilder, i3);
                }
                if (aVar.e(this.reader) < 0) {
                    this.finished = true;
                    if (!strBuilder.hasContent() && i2 != this.config.fieldSeparator) {
                        break;
                    }
                    addField(arrayList, strBuilder.toStringAndReset());
                    break;
                }
                i3 = 0;
                cB = aVar.b();
                z = i2 >= 0 ? true : true;
                if (z) {
                    if (cB != '\r') {
                        this.lineNo++;
                        z = false;
                    } else {
                        this.lineNo++;
                        z = false;
                    }
                    aVar.d();
                } else {
                    if (this.inQuotes) {
                        csvReadConfig = this.config;
                        if (cB == csvReadConfig.fieldSeparator) {
                            if (cB == csvReadConfig.textDelimiter) {
                                if (cB == '\r') {
                                    if (i3 > 0) {
                                        aVar.a(strBuilder, i3);
                                    }
                                    aVar.d();
                                    addField(arrayList, strBuilder.toStringAndReset());
                                } else if (cB == '\n') {
                                    if (i2 != 13) {
                                        if (i3 > 0) {
                                            aVar.a(strBuilder, i3);
                                        }
                                        aVar.d();
                                        addField(arrayList, strBuilder.toStringAndReset());
                                    } else {
                                        aVar.d();
                                    }
                                }
                                i2 = cB;
                                break;
                            }
                            this.inQuotes = true;
                        } else {
                            if (i3 > 0) {
                                aVar.a(strBuilder, i3);
                                i3 = 0;
                            }
                            aVar.d();
                            addField(arrayList, strBuilder.toStringAndReset());
                        }
                    } else if (cB == this.config.textDelimiter) {
                        this.inQuotes = false;
                    } else if (isLineEnd(cB)) {
                        this.inQuotesLineCount++;
                    }
                    i3++;
                }
                i2 = cB;
            }
        }
        this.preChar = i2;
        this.lineNo++;
        return arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.reader.close();
    }

    public List<String> getHeader() {
        CsvReadConfig csvReadConfig = this.config;
        if (!csvReadConfig.containsHeader) {
            throw new IllegalStateException("No header available - header parsing is disabled");
        }
        if (this.lineNo >= csvReadConfig.beginLineNo) {
            return this.header.c;
        }
        throw new IllegalStateException("No header available - call nextRow() first");
    }

    public b55 nextRow() throws IORuntimeException {
        List<String> line;
        int size;
        while (true) {
            if (this.finished || (size = (line = readLine()).size()) < 1) {
                break;
            }
            long j = this.lineNo;
            CsvReadConfig csvReadConfig = this.config;
            if (j >= csvReadConfig.beginLineNo) {
                if (j > csvReadConfig.endLineNo) {
                    break;
                }
                if (!csvReadConfig.skipEmptyRows || size != 1 || !line.get(0).isEmpty()) {
                    CsvReadConfig csvReadConfig2 = this.config;
                    if (csvReadConfig2.errorOnDifferentFieldCount) {
                        int i = this.firstLineFieldCount;
                        if (i < 0) {
                            this.firstLineFieldCount = size;
                        } else if (size != i) {
                            throw new IORuntimeException(String.format("Line %d has %d fields, but first line has %d fields", Long.valueOf(this.lineNo), Integer.valueOf(size), Integer.valueOf(this.firstLineFieldCount)));
                        }
                    }
                    if (size > this.maxFieldCount) {
                        this.maxFieldCount = size;
                    }
                    if (!csvReadConfig2.containsHeader || this.header != null) {
                        long j2 = this.lineNo;
                        b55 b55Var = this.header;
                        return new b55(j2, b55Var != null ? b55Var.f3808b : null, line);
                    }
                    initHeader(line);
                }
            }
        }
        return null;
    }
}
