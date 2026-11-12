package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Strings;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
final class w {
    private static final Pattern a = Pattern.compile("([a-z])=\\s?(.+)");
    private static final Pattern b = Pattern.compile("([0-9A-Za-z-]+)(?::(.*))?");
    private static final Pattern c = Pattern.compile("(\\S+)\\s(\\S+)\\s(\\S+)\\s(\\S+)");
    private static final String d = "v";
    private static final String e = "o";
    private static final String f = "s";
    private static final String g = "i";
    private static final String h = "u";
    private static final String i = "e";
    private static final String j = "p";
    private static final String k = "c";
    private static final String l = "b";
    private static final String m = "t";
    private static final String n = "k";
    private static final String o = "a";
    private static final String p = "m";
    private static final String q = "r";
    private static final String r = "z";

    private w() {
    }

    private static void a(SessionDescription.Builder sessionDescriptionBuilder, MediaDescription.Builder mediaDescriptionBuilder) throws ParserException {
        try {
            sessionDescriptionBuilder.addMediaDescription(mediaDescriptionBuilder.build());
        } catch (IllegalArgumentException | IllegalStateException e2) {
            throw ParserException.createForMalformedManifest(null, e2);
        }
    }

    public static SessionDescription b(String sdpString) throws ParserException {
        SessionDescription.Builder builder = new SessionDescription.Builder();
        MediaDescription.Builder builderC = null;
        for (String str : RtspMessageUtil.q(sdpString)) {
            if (!"".equals(str)) {
                Matcher matcher = a.matcher(str);
                if (!matcher.matches()) {
                    String strValueOf = String.valueOf(str);
                    throw ParserException.createForMalformedManifest(strValueOf.length() != 0 ? "Malformed SDP line: ".concat(strValueOf) : new String("Malformed SDP line: "), null);
                }
                String str2 = (String) Assertions.checkNotNull(matcher.group(1));
                String str3 = (String) Assertions.checkNotNull(matcher.group(2));
                byte b2 = -1;
                switch (str2.hashCode()) {
                    case 97:
                        if (str2.equals(o)) {
                            b2 = 11;
                        }
                        break;
                    case 98:
                        if (str2.equals(l)) {
                            b2 = 8;
                        }
                        break;
                    case 99:
                        if (str2.equals(k)) {
                            b2 = 7;
                        }
                        break;
                    case 101:
                        if (str2.equals(i)) {
                            b2 = 5;
                        }
                        break;
                    case 105:
                        if (str2.equals(g)) {
                            b2 = 3;
                        }
                        break;
                    case 107:
                        if (str2.equals("k")) {
                            b2 = 10;
                        }
                        break;
                    case 109:
                        if (str2.equals(p)) {
                            b2 = 12;
                        }
                        break;
                    case 111:
                        if (str2.equals(e)) {
                            b2 = 1;
                        }
                        break;
                    case 112:
                        if (str2.equals("p")) {
                            b2 = 6;
                        }
                        break;
                    case 114:
                        if (str2.equals(q)) {
                            b2 = 13;
                        }
                        break;
                    case 115:
                        if (str2.equals("s")) {
                            b2 = 2;
                        }
                        break;
                    case 116:
                        if (str2.equals("t")) {
                            b2 = 9;
                        }
                        break;
                    case 117:
                        if (str2.equals("u")) {
                            b2 = 4;
                        }
                        break;
                    case 118:
                        if (str2.equals("v")) {
                            b2 = 0;
                        }
                        break;
                    case 122:
                        if (str2.equals(r)) {
                            b2 = 14;
                        }
                        break;
                }
                switch (b2) {
                    case 0:
                        if (!"0".equals(str3)) {
                            throw ParserException.createForMalformedManifest(String.format("SDP version %s is not supported.", str3), null);
                        }
                        break;
                        break;
                    case 1:
                        builder.setOrigin(str3);
                        break;
                    case 2:
                        builder.setSessionName(str3);
                        break;
                    case 3:
                        if (builderC == null) {
                            builder.setSessionInfo(str3);
                        } else {
                            builderC.setMediaTitle(str3);
                        }
                        break;
                    case 4:
                        builder.setUri(Uri.parse(str3));
                        break;
                    case 5:
                        builder.setEmailAddress(str3);
                        break;
                    case 6:
                        builder.setPhoneNumber(str3);
                        break;
                    case 7:
                        if (builderC == null) {
                            builder.setConnection(str3);
                        } else {
                            builderC.setConnection(str3);
                        }
                        break;
                    case 8:
                        String[] strArrSplit = Util.split(str3, ":\\s?");
                        Assertions.checkArgument(strArrSplit.length == 2);
                        int i2 = Integer.parseInt(strArrSplit[1]);
                        if (builderC == null) {
                            builder.setBitrate(i2 * 1000);
                        } else {
                            builderC.setBitrate(i2 * 1000);
                        }
                        break;
                    case 9:
                        builder.setTiming(str3);
                        break;
                    case 10:
                        if (builderC == null) {
                            builder.setKey(str3);
                        } else {
                            builderC.setKey(str3);
                        }
                        break;
                    case 11:
                        Matcher matcher2 = b.matcher(str3);
                        if (!matcher2.matches()) {
                            String strValueOf2 = String.valueOf(str);
                            throw ParserException.createForMalformedManifest(strValueOf2.length() != 0 ? "Malformed Attribute line: ".concat(strValueOf2) : new String("Malformed Attribute line: "), null);
                        }
                        String str4 = (String) Assertions.checkNotNull(matcher2.group(1));
                        String strNullToEmpty = Strings.nullToEmpty(matcher2.group(2));
                        if (builderC == null) {
                            builder.addAttribute(str4, strNullToEmpty);
                        } else {
                            builderC.addAttribute(str4, strNullToEmpty);
                        }
                        break;
                        break;
                    case 12:
                        if (builderC != null) {
                            a(builder, builderC);
                        }
                        builderC = c(str3);
                        break;
                }
            }
        }
        if (builderC != null) {
            a(builder, builderC);
        }
        try {
            return builder.build();
        } catch (IllegalArgumentException | IllegalStateException e2) {
            throw ParserException.createForMalformedManifest(null, e2);
        }
    }

    private static MediaDescription.Builder c(String line) throws ParserException {
        Matcher matcher = c.matcher(line);
        if (!matcher.matches()) {
            String strValueOf = String.valueOf(line);
            throw ParserException.createForMalformedManifest(strValueOf.length() != 0 ? "Malformed SDP media description line: ".concat(strValueOf) : new String("Malformed SDP media description line: "), null);
        }
        try {
            return new MediaDescription.Builder((String) Assertions.checkNotNull(matcher.group(1)), Integer.parseInt((String) Assertions.checkNotNull(matcher.group(2))), (String) Assertions.checkNotNull(matcher.group(3)), Integer.parseInt((String) Assertions.checkNotNull(matcher.group(4))));
        } catch (NumberFormatException e2) {
            String strValueOf2 = String.valueOf(line);
            throw ParserException.createForMalformedManifest(strValueOf2.length() != 0 ? "Malformed SDP media description line: ".concat(strValueOf2) : new String("Malformed SDP media description line: "), e2);
        }
    }
}
