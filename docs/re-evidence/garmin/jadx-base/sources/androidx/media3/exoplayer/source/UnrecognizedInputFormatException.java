package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.ParserException;
import bb.k0;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.InlineMe;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class UnrecognizedInputFormatException extends ParserException {
    public final ImmutableList<k0> sniffFailures;
    public final Uri uri;

    public UnrecognizedInputFormatException(String str, Uri uri, List<? extends k0> list) {
        super(str, null, false, 1);
        this.uri = uri;
        this.sniffFailures = ImmutableList.copyOf((Collection) list);
    }

    @InlineMe(imports = {"com.google.common.collect.ImmutableList"}, replacement = "this(message, uri, ImmutableList.of())")
    @Deprecated
    public UnrecognizedInputFormatException(String str, Uri uri) {
        this(str, uri, ImmutableList.of());
    }
}
