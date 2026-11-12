package com.huami.sync;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB\t\b\u0016¢\u0006\u0004\b\u0019\u0010\u001aB\u0013\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0019\u0010\u001bB'\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u000b\"\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001cB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001dJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J)\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u000b\"\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0012\u0010\r\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\u0011\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007J\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0004J\u0016\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015R\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0018¨\u0006 "}, d2 = {"Lcom/huami/sync/Spanny;", "Landroid/text/SpannableStringBuilder;", "", "span", "", "start", "end", "", "a", "", "text", "", "spans", "append", "(Ljava/lang/CharSequence;[Ljava/lang/Object;)Lcom/huami/sync/Spanny;", "Landroid/text/style/ImageSpan;", "imageSpan", "appendText", "flag", "setFlag", "textToSpan", "Lcom/huami/sync/Spanny$GetSpan;", "getSpan", "findAndSpan", LogUtil.I, "<init>", "()V", "(Ljava/lang/CharSequence;)V", "(Ljava/lang/CharSequence;[Ljava/lang/Object;)V", "(Ljava/lang/CharSequence;Ljava/lang/Object;)V", "Companion", "GetSpan", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
public final class Spanny extends SpannableStringBuilder {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int flag;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0004\u001a\u00020\u00018&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/sync/Spanny$GetSpan;", "", "getSpan", "()Ljava/lang/Object;", "span", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
    public interface GetSpan {
        @NotNull
        Object getSpan();
    }

    public Spanny() {
        super("");
        this.flag = 33;
    }

    private final void a(Object span, int start, int end) {
        setSpan(span, start, end, this.flag);
    }

    @Deprecated(message = "use {@link #append(CharSequence text)}")
    @NotNull
    public final Spanny appendText(@Nullable CharSequence text) {
        append(text);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return get(i);
    }

    @NotNull
    public final Spanny findAndSpan(@NotNull CharSequence textToSpan, @NotNull GetSpan getSpan) {
        int iIndexOf$default = 0;
        while (iIndexOf$default != -1) {
            iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) toString(), textToSpan.toString(), iIndexOf$default, false, 4, (Object) null);
            if (iIndexOf$default != -1) {
                a(getSpan.getSpan(), iIndexOf$default, textToSpan.length() + iIndexOf$default);
                iIndexOf$default += textToSpan.length();
            }
        }
        return this;
    }

    public /* bridge */ char get(int i) {
        return super.charAt(i);
    }

    public /* bridge */ int getLength() {
        return super.length();
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    public final void setFlag(int flag) {
        this.flag = flag;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004\"\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0001¨\u0006\f"}, d2 = {"Lcom/huami/sync/Spanny$Companion;", "", "", "text", "", "spans", "Landroid/text/SpannableString;", "spanText", "(Ljava/lang/CharSequence;[Ljava/lang/Object;)Landroid/text/SpannableString;", "span", "<init>", "()V", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SpannableString spanText(@NotNull CharSequence text, @NotNull Object... spans) {
            SpannableString spannableString = new SpannableString(text);
            int length = spans.length;
            int i = 0;
            while (i < length) {
                Object obj = spans[i];
                i++;
                spannableString.setSpan(obj, 0, text.length(), 33);
            }
            return spannableString;
        }

        @NotNull
        public final SpannableString spanText(@NotNull CharSequence text, @Nullable Object span) {
            SpannableString spannableString = new SpannableString(text);
            spannableString.setSpan(span, 0, text.length(), 33);
            return spannableString;
        }
    }

    public Spanny(@Nullable CharSequence charSequence) {
        super(charSequence);
        this.flag = 33;
    }

    @NotNull
    public final Spanny append(@NotNull CharSequence text, @NotNull Object... spans) {
        int i = 0;
        append(text, new Object[0]);
        int length = spans.length;
        while (i < length) {
            Object obj = spans[i];
            i++;
            a(obj, length() - text.length(), length());
        }
        return this;
    }

    public Spanny(@Nullable CharSequence charSequence, @NotNull Object... objArr) {
        super(charSequence);
        this.flag = 33;
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            a(obj, 0, length());
        }
    }

    @NotNull
    public final Spanny append(@NotNull CharSequence text, @NotNull Object span) {
        append(text, new Object[0]);
        a(span, length() - text.length(), length());
        return this;
    }

    public Spanny(@NotNull CharSequence charSequence, @NotNull Object obj) {
        super(charSequence);
        this.flag = 33;
        a(obj, 0, charSequence.length());
    }

    @NotNull
    public final Spanny append(@NotNull CharSequence text, @NotNull ImageSpan imageSpan) {
        String strStringPlus = Intrinsics.stringPlus(".", text);
        append((CharSequence) strStringPlus, new Object[0]);
        a(imageSpan, length() - strStringPlus.length(), (length() - strStringPlus.length()) + 1);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NotNull
    public Spanny append(@Nullable CharSequence text) {
        super.append(text);
        return this;
    }
}
