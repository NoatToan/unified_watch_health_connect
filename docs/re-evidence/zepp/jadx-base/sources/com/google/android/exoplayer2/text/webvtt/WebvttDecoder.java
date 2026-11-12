package com.google.android.exoplayer2.text.webvtt;

import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class WebvttDecoder extends SimpleSubtitleDecoder {
    private static final int q = -1;
    private static final int r = 0;
    private static final int s = 1;
    private static final int t = 2;
    private static final int u = 3;
    private static final String v = "NOTE";
    private static final String w = "STYLE";
    private final ParsableByteArray o;
    private final b p;

    public WebvttDecoder() {
        super("WebvttDecoder");
        this.o = new ParsableByteArray();
        this.p = new b();
    }

    private static int j(ParsableByteArray parsableWebvttData) {
        int i = -1;
        int position = 0;
        while (i == -1) {
            position = parsableWebvttData.getPosition();
            String line = parsableWebvttData.readLine();
            if (line == null) {
                i = 0;
            } else if ("STYLE".equals(line)) {
                i = 2;
            } else {
                i = line.startsWith(v) ? 1 : 3;
            }
        }
        parsableWebvttData.setPosition(position);
        return i;
    }

    private static void k(ParsableByteArray parsableWebvttData) {
        while (!TextUtils.isEmpty(parsableWebvttData.readLine())) {
        }
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    public Subtitle decode(byte[] bytes, int length, boolean reset) throws SubtitleDecoderException {
        WebvttCueInfo cue;
        this.o.reset(bytes, length);
        ArrayList arrayList = new ArrayList();
        try {
            WebvttParserUtil.validateWebvttHeaderLine(this.o);
            while (!TextUtils.isEmpty(this.o.readLine())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int iJ = j(this.o);
                if (iJ == 0) {
                    return new e(arrayList2);
                }
                if (iJ == 1) {
                    k(this.o);
                } else if (iJ == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new SubtitleDecoderException("A style block was found after the first cue.");
                    }
                    this.o.readLine();
                    arrayList.addAll(this.p.d(this.o));
                } else if (iJ == 3 && (cue = WebvttCueParser.parseCue(this.o, arrayList)) != null) {
                    arrayList2.add(cue);
                }
            }
        } catch (ParserException e) {
            throw new SubtitleDecoderException(e);
        }
    }
}
