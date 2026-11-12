package kotlinx.serialization;

import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tB\u001f\b\u0010\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlinx/serialization/MissingFieldException;", "Lkotlinx/serialization/SerializationException;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "fieldName", "(Ljava/lang/String;)V", "", "fieldNames", "serialName", "(Ljava/util/List;Ljava/lang/String;)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 5, 1})
@PublishedApi
public final class MissingFieldException extends SerializationException {
    public MissingFieldException(@Nullable String str, @Nullable Throwable th) {
        super(str, th);
    }

    public MissingFieldException(@NotNull String str) {
        this("Field '" + str + "' is required, but it was missing", (Throwable) null);
    }

    public MissingFieldException(@NotNull List<String> list, @NotNull String str) {
        StringBuilder sb;
        String str2;
        if (list.size() == 1) {
            sb = new StringBuilder();
            sb.append("Field '");
            sb.append(list.get(0));
            sb.append("' is required for type with serial name '");
            sb.append(str);
            str2 = "', but it was missing";
        } else {
            sb = new StringBuilder();
            sb.append("Fields ");
            sb.append(list);
            sb.append(" are required for type with serial name '");
            sb.append(str);
            str2 = "', but they were missing";
        }
        sb.append(str2);
        this(sb.toString(), (Throwable) null);
    }
}
