package linc.com.amplituda;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class AmplitudaResult<T> {
    private final String amplitudes;
    private final InputAudio<T> inputAudio;

    public enum DurationUnit {
        SECONDS,
        MILLIS
    }

    public enum SequenceFormat {
        SINGLE_LINE,
        NEW_LINE
    }

    public AmplitudaResult(String str, InputAudio<T> inputAudio) {
        this.amplitudes = str;
        this.inputAudio = inputAudio;
    }

    private String amplitudesToSingleLineSequence(String str, String str2) {
        return TextUtils.join(str2, str.split("\n"));
    }

    public String amplitudesAsJson() {
        String str = this.amplitudes;
        return (str == null || str.isEmpty()) ? "" : Arrays.toString(amplitudesAsList().toArray());
    }

    public List<Integer> amplitudesAsList() {
        String str = this.amplitudes;
        if (str == null || str.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        String[] strArrSplit = this.amplitudes.split("\n");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (str2.isEmpty()) {
                break;
            }
            arrayList.add(Integer.valueOf(str2));
        }
        return arrayList;
    }

    public String amplitudesAsSequence(SequenceFormat sequenceFormat, String str) {
        String str2 = this.amplitudes;
        if (str2 == null || str2.isEmpty()) {
            return "";
        }
        SequenceFormat sequenceFormat2 = SequenceFormat.SINGLE_LINE;
        String str3 = this.amplitudes;
        return sequenceFormat == sequenceFormat2 ? amplitudesToSingleLineSequence(str3, str) : str3;
    }

    public List<Integer> amplitudesForSecond(int i14) {
        List<Integer> listAmplitudesAsList = amplitudesAsList();
        int audioDuration = (int) getAudioDuration(DurationUnit.SECONDS);
        if (i14 > audioDuration || audioDuration == 0) {
            return Collections.EMPTY_LIST;
        }
        int size = listAmplitudesAsList.size() / audioDuration;
        int size2 = (listAmplitudesAsList.size() * i14) / audioDuration;
        ArrayList arrayList = new ArrayList();
        for (int i15 = size2; i15 > size2 - size && i15 >= 0 && i15 < listAmplitudesAsList.size(); i15--) {
            arrayList.add(listAmplitudesAsList.get(i15));
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public long getAudioDuration(DurationUnit durationUnit) {
        DurationUnit durationUnit2 = DurationUnit.SECONDS;
        InputAudio<T> inputAudio = this.inputAudio;
        return durationUnit == durationUnit2 ? inputAudio.getDuration() / 1000 : inputAudio.getDuration();
    }

    public T getAudioSource() {
        return this.inputAudio.getSource();
    }

    public InputAudio.Type getInputAudioType() {
        return this.inputAudio.getType();
    }

    public String amplitudesAsSequence(SequenceFormat sequenceFormat) {
        String str = this.amplitudes;
        if (str != null && !str.isEmpty()) {
            return amplitudesAsSequence(sequenceFormat, StringUtils.SPACE);
        }
        return "";
    }
}
