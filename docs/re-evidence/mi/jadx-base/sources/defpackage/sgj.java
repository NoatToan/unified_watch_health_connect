package defpackage;

import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface sgj {
    wsk a(cj2 cj2Var, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException;

    void reset();
}
