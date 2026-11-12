package kotlinx.serialization.json.internal;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.sleep.model.DataConstant;
import io.netty.util.internal.StringUtil;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0002\u0010\u0006\n\u0002\u0010\u0005\n\u0002\u0010\n\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b#\u0010$J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\nJ\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u000bH\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\fH\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\rH\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u000eH\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u000fH\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0010H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0011H\u0016J\u000e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\nR\u0016\u0010\u0015\u001a\u00020\u00148\u0000@\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0000@\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\"\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006%"}, d2 = {"Lkotlinx/serialization/json/internal/Composer;", "", "", "indent", "unIndent", "nextItem", "space", "", "v", "print", "", "", "", "", "", "", "", "", "value", "printQuoted", "Lkotlinx/serialization/json/internal/JsonStringBuilder;", DataConstant.KEY_SLEEP_STATE, "Lkotlinx/serialization/json/internal/JsonStringBuilder;", "Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/json/Json;", "a", LogUtil.I, FirebaseAnalytics.Param.LEVEL, "<set-?>", "b", "Z", "getWritingFirst", "()Z", "writingFirst", "<init>", "(Lkotlinx/serialization/json/internal/JsonStringBuilder;Lkotlinx/serialization/json/Json;)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 5, 1})
public class Composer {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int level;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean writingFirst = true;

    @JvmField
    @NotNull
    public final Json json;

    @JvmField
    @NotNull
    public final JsonStringBuilder sb;

    public Composer(@NotNull JsonStringBuilder jsonStringBuilder, @NotNull Json json) {
        this.sb = jsonStringBuilder;
        this.json = json;
    }

    public final boolean getWritingFirst() {
        return this.writingFirst;
    }

    public final void indent() {
        this.writingFirst = true;
        this.level++;
    }

    public final void nextItem() {
        this.writingFirst = false;
        if (this.json.getConfiguration().getPrettyPrint()) {
            print("\n");
            int i = this.level;
            for (int i2 = 0; i2 < i; i2++) {
                print(this.json.getConfiguration().getPrettyPrintIndent());
            }
        }
    }

    public final void print(char v) {
        this.sb.append(v);
    }

    public final void printQuoted(@NotNull String value) {
        this.sb.appendQuoted(value);
    }

    public final void space() {
        if (this.json.getConfiguration().getPrettyPrint()) {
            print(StringUtil.SPACE);
        }
    }

    public final void unIndent() {
        this.level--;
    }

    public final void print(@NotNull String v) {
        this.sb.append(v);
    }

    public void print(float v) {
        this.sb.append(String.valueOf(v));
    }

    public void print(double v) {
        this.sb.append(String.valueOf(v));
    }

    public void print(byte v) {
        this.sb.append(v);
    }

    public void print(short v) {
        this.sb.append(v);
    }

    public void print(int v) {
        this.sb.append(v);
    }

    public void print(long v) {
        this.sb.append(v);
    }

    public void print(boolean v) {
        this.sb.append(String.valueOf(v));
    }
}
