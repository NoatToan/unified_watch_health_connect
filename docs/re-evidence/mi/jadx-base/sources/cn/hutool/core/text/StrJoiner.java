package cn.hutool.core.text;

import cn.hutool.core.collection.ArrayIter;
import cn.hutool.core.io.IORuntimeException;
import defpackage.qj1;
import defpackage.tt3;
import java.io.IOException;
import java.util.Iterator;
import java.util.function.Function;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class StrJoiner implements Appendable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Appendable f5557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f5558b;
    public CharSequence c;
    public CharSequence d;
    public boolean e;
    public NullMode f;
    public String g;
    public boolean h;

    public enum NullMode {
        IGNORE,
        TO_EMPTY,
        NULL_STRING
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5559a;

        static {
            int[] iArr = new int[NullMode.values().length];
            f5559a = iArr;
            try {
                iArr[NullMode.IGNORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5559a[NullMode.TO_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5559a[NullMode.NULL_STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public StrJoiner(CharSequence charSequence) {
        this(null, charSequence);
    }

    public static StrJoiner j(CharSequence charSequence) {
        return new StrJoiner(charSequence);
    }

    @Override // java.lang.Appendable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public StrJoiner append(char c) {
        return append(String.valueOf(c));
    }

    @Override // java.lang.Appendable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public StrJoiner append(CharSequence charSequence) {
        if (charSequence == null) {
            int i = a.f5559a[this.f.ordinal()];
            if (i == 1) {
                return this;
            }
            if (i == 2) {
                charSequence = "";
            } else if (i == 3) {
                charSequence = AbstractJsonLexerKt.NULL;
            }
        }
        try {
            Appendable appendableK = k();
            if (this.e && tt3.I(this.c)) {
                appendableK.append(this.c);
            }
            appendableK.append(charSequence);
            if (this.e && tt3.I(this.d)) {
                appendableK.append(this.d);
            }
            return this;
        } catch (IOException e) {
            throw new IORuntimeException(e);
        }
    }

    @Override // java.lang.Appendable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public StrJoiner append(CharSequence charSequence, int i, int i2) {
        return append(tt3.k0(charSequence, i, i2));
    }

    public <T> StrJoiner e(Object obj) {
        if (obj == null) {
            append(null);
        } else if (qj1.B(obj)) {
            f(new ArrayIter(obj));
        } else if (obj instanceof Iterator) {
            f((Iterator) obj);
        } else if (obj instanceof Iterable) {
            f(((Iterable) obj).iterator());
        } else {
            append(String.valueOf(obj));
        }
        return this;
    }

    public <T> StrJoiner f(Iterator<T> it) {
        return it == null ? this : g(it, new Function() { // from class: gio
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f19038a.i(obj);
            }
        });
    }

    public <T> StrJoiner g(Iterator<T> it, Function<T, ? extends CharSequence> function) {
        if (it != null) {
            while (it.hasNext()) {
                append(function.apply(it.next()));
            }
        }
        return this;
    }

    public final void h(Appendable appendable) {
        if (appendable instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) appendable;
            if (charSequence.length() <= 0 || !tt3.r(charSequence, this.f5558b)) {
                return;
            }
            this.h = true;
            return;
        }
        String string = appendable.toString();
        if (!tt3.I(string) || tt3.r(string, this.f5558b)) {
            return;
        }
        this.h = true;
    }

    public final /* synthetic */ CharSequence i(Object obj) {
        return j(this.f5558b).e(obj).toString();
    }

    public final Appendable k() throws IOException {
        if (this.h) {
            this.f5557a.append(this.f5558b);
        } else {
            if (this.f5557a == null) {
                this.f5557a = new StringBuilder();
            }
            if (!this.e && tt3.I(this.c)) {
                this.f5557a.append(this.c);
            }
            this.h = true;
        }
        return this.f5557a;
    }

    public String toString() {
        if (this.f5557a == null) {
            return this.g;
        }
        if (!this.e && tt3.I(this.d)) {
            try {
                this.f5557a.append(this.d);
            } catch (IOException e) {
                throw new IORuntimeException(e);
            }
        }
        return this.f5557a.toString();
    }

    public StrJoiner(Appendable appendable, CharSequence charSequence) {
        this(appendable, charSequence, null, null);
    }

    public StrJoiner(Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.f = NullMode.NULL_STRING;
        this.g = "";
        if (appendable != null) {
            this.f5557a = appendable;
            h(appendable);
        }
        this.f5558b = charSequence;
        this.c = charSequence2;
        this.d = charSequence3;
    }
}
