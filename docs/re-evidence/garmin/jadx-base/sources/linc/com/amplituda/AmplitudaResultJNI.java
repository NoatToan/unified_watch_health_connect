package linc.com.amplituda;

import java.util.LinkedHashSet;
import linc.com.amplituda.exceptions.AmplitudaException;
import linc.com.amplituda.exceptions.allocation.CodecContextAllocationException;
import linc.com.amplituda.exceptions.allocation.FrameAllocationException;
import linc.com.amplituda.exceptions.allocation.PacketAllocationException;
import linc.com.amplituda.exceptions.io.FileOpenException;
import linc.com.amplituda.exceptions.processing.CodecNotFoundException;
import linc.com.amplituda.exceptions.processing.CodecOpenException;
import linc.com.amplituda.exceptions.processing.CodecParametersException;
import linc.com.amplituda.exceptions.processing.DecodingException;
import linc.com.amplituda.exceptions.processing.PacketSubmittingException;
import linc.com.amplituda.exceptions.processing.SampleOutOfBoundsException;
import linc.com.amplituda.exceptions.processing.StreamInformationNotFoundException;
import linc.com.amplituda.exceptions.processing.StreamNotFoundException;
import linc.com.amplituda.exceptions.processing.UnsupportedSampleFormatException;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes3.dex */
final class AmplitudaResultJNI {
    private String amplitudes;
    private double duration;
    private String errors;

    private AmplitudaException getExceptionFromCode(int i14) {
        if (i14 == 20) {
            return new FileOpenException();
        }
        if (i14 == 40) {
            return new SampleOutOfBoundsException();
        }
        switch (i14) {
            case 10:
                return new FrameAllocationException();
            case 11:
                return new PacketAllocationException();
            case 12:
                return new CodecContextAllocationException();
            default:
                switch (i14) {
                    case 30:
                        return new CodecNotFoundException();
                    case 31:
                        return new StreamNotFoundException();
                    case 32:
                        return new StreamInformationNotFoundException();
                    case 33:
                        return new CodecParametersException();
                    case 34:
                        return new PacketSubmittingException();
                    case 35:
                        return new CodecOpenException();
                    case 36:
                        return new UnsupportedSampleFormatException();
                    case 37:
                        return new DecodingException();
                    default:
                        return new AmplitudaException();
                }
        }
    }

    public String getAmplitudes() {
        return this.amplitudes;
    }

    public long getDurationMillis() {
        return (long) (this.duration * 1000.0d);
    }

    public LinkedHashSet<AmplitudaException> getErrors() {
        String str = this.errors;
        if (str == null || str.isEmpty()) {
            return new LinkedHashSet<>();
        }
        LinkedHashSet<AmplitudaException> linkedHashSet = new LinkedHashSet<>();
        for (String str2 : this.errors.split(StringUtils.SPACE)) {
            if (!str2.isEmpty()) {
                linkedHashSet.add(getExceptionFromCode(Integer.parseInt(str2)));
            }
        }
        return linkedHashSet;
    }

    public void setAmplitudes(String str) {
        this.amplitudes = str;
    }

    public void setDuration(double d14) {
        this.duration = d14;
    }
}
