package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.util.Util;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class GaplessInfoHolder {
    private static final String a = "com.apple.iTunes";
    private static final String b = "iTunSMPB";
    private static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int encoderDelay = -1;
    public int encoderPadding = -1;

    private boolean a(String data) {
        Matcher matcher = c.matcher(data);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i = Integer.parseInt((String) Util.castNonNull(matcher.group(1)), 16);
            int i2 = Integer.parseInt((String) Util.castNonNull(matcher.group(2)), 16);
            if (i <= 0 && i2 <= 0) {
                return false;
            }
            this.encoderDelay = i;
            this.encoderPadding = i2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean hasGaplessInfo() {
        return (this.encoderDelay == -1 || this.encoderPadding == -1) ? false : true;
    }

    public boolean setFromMetadata(Metadata metadata) {
        for (int i = 0; i < metadata.length(); i++) {
            Metadata.Entry entry = metadata.get(i);
            if (entry instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) entry;
                if (b.equals(commentFrame.description) && a(commentFrame.text)) {
                    return true;
                }
            } else if (entry instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) entry;
                if (a.equals(internalFrame.domain) && b.equals(internalFrame.description) && a(internalFrame.text)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public boolean setFromXingHeaderValue(int value) {
        int i = value >> 12;
        int i2 = value & 4095;
        if (i <= 0 && i2 <= 0) {
            return false;
        }
        this.encoderDelay = i;
        this.encoderPadding = i2;
        return true;
    }
}
