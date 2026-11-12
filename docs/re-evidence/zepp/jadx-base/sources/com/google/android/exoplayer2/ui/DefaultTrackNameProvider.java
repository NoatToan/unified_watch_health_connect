package com.google.android.exoplayer2.ui;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultTrackNameProvider implements TrackNameProvider {
    private final Resources a;

    public DefaultTrackNameProvider(Resources resources) {
        this.a = (Resources) Assertions.checkNotNull(resources);
    }

    private String a(Format format) {
        int i = format.channelCount;
        if (i == -1 || i < 1) {
            return "";
        }
        if (i == 1) {
            return this.a.getString(R.string.exo_track_mono);
        }
        if (i == 2) {
            return this.a.getString(R.string.exo_track_stereo);
        }
        if (i == 6 || i == 7) {
            return this.a.getString(R.string.exo_track_surround_5_point_1);
        }
        return i != 8 ? this.a.getString(R.string.exo_track_surround) : this.a.getString(R.string.exo_track_surround_7_point_1);
    }

    private String b(Format format) {
        int i = format.bitrate;
        return i == -1 ? "" : this.a.getString(R.string.exo_track_bitrate, Float.valueOf(i / 1000000.0f));
    }

    private String c(Format format) {
        return TextUtils.isEmpty(format.label) ? "" : format.label;
    }

    private String d(Format format) {
        String strI = i(e(format), g(format));
        return TextUtils.isEmpty(strI) ? c(format) : strI;
    }

    private String e(Format format) {
        String str = format.language;
        if (TextUtils.isEmpty(str) || C.LANGUAGE_UNDETERMINED.equals(str)) {
            return "";
        }
        return (Util.SDK_INT >= 21 ? Locale.forLanguageTag(str) : new Locale(str)).getDisplayName();
    }

    private String f(Format format) {
        int i = format.width;
        int i2 = format.height;
        return (i == -1 || i2 == -1) ? "" : this.a.getString(R.string.exo_track_resolution, Integer.valueOf(i), Integer.valueOf(i2));
    }

    private String g(Format format) {
        String string = (format.roleFlags & 2) != 0 ? this.a.getString(R.string.exo_track_role_alternate) : "";
        if ((format.roleFlags & 4) != 0) {
            string = i(string, this.a.getString(R.string.exo_track_role_supplementary));
        }
        if ((format.roleFlags & 8) != 0) {
            string = i(string, this.a.getString(R.string.exo_track_role_commentary));
        }
        return (format.roleFlags & 1088) != 0 ? i(string, this.a.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    private static int h(Format format) {
        int trackType = MimeTypes.getTrackType(format.sampleMimeType);
        if (trackType != -1) {
            return trackType;
        }
        if (MimeTypes.getVideoMediaMimeType(format.codecs) != null) {
            return 2;
        }
        if (MimeTypes.getAudioMediaMimeType(format.codecs) != null) {
            return 1;
        }
        if (format.width == -1 && format.height == -1) {
            return (format.channelCount == -1 && format.sampleRate == -1) ? -1 : 1;
        }
        return 2;
    }

    private String i(String... items) {
        String string = "";
        for (String str : items) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.a.getString(R.string.exo_item_list, string, str);
            }
        }
        return string;
    }

    @Override // com.google.android.exoplayer2.ui.TrackNameProvider
    public String getTrackName(Format format) {
        String strI;
        int iH = h(format);
        if (iH == 2) {
            strI = i(g(format), f(format), b(format));
        } else {
            strI = iH == 1 ? i(d(format), a(format), b(format)) : d(format);
        }
        return strI.length() == 0 ? this.a.getString(R.string.exo_track_unknown) : strI;
    }
}
