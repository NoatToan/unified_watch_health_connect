package linc.com.amplituda.exceptions.processing;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class SecondOutOfBoundsException extends AmplitudaProcessingException {
    public SecondOutOfBoundsException(int i14, int i15) {
        super(String.format(Locale.getDefault(), "Cannot extract amplitudes for second %d when input audio duration = %d", Integer.valueOf(i14), Integer.valueOf(i15)), 39);
    }

    public SecondOutOfBoundsException() {
        this(0, 0);
    }
}
