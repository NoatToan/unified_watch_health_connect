package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import androidx.annotation.Nullable;
import androidx.compose.material.TextFieldImplKt;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.UriUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.XmlPullParserUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.common.base.Ascii;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.huami.assistant.ocr.camera.CameraActivity;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes3.dex */
public class DashManifestParser extends DefaultHandler implements ParsingLoadable.Parser<DashManifest> {
    private static final String b = "MpdParser";
    private static final Pattern c = Pattern.compile("(\\d+)(?:/(\\d+))?");
    private static final Pattern d = Pattern.compile("CC([1-4])=.*");
    private static final Pattern e = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    private static final int[] f = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};
    private final XmlPullParserFactory a;

    public static final class RepresentationInfo {
        public final ImmutableList<BaseUrl> baseUrls;
        public final ArrayList<DrmInitData.SchemeData> drmSchemeDatas;

        @Nullable
        public final String drmSchemeType;
        public final Format format;
        public final ArrayList<Descriptor> inbandEventStreams;
        public final long revisionId;
        public final SegmentBase segmentBase;

        public RepresentationInfo(Format format, List<BaseUrl> baseUrls, SegmentBase segmentBase, @Nullable String drmSchemeType, ArrayList<DrmInitData.SchemeData> drmSchemeDatas, ArrayList<Descriptor> inbandEventStreams, long revisionId) {
            this.format = format;
            this.baseUrls = ImmutableList.copyOf((Collection) baseUrls);
            this.segmentBase = segmentBase;
            this.drmSchemeType = drmSchemeType;
            this.drmSchemeDatas = drmSchemeDatas;
            this.inbandEventStreams = inbandEventStreams;
            this.revisionId = revisionId;
        }
    }

    public DashManifestParser() {
        try {
            this.a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    private long a(List<SegmentBase.SegmentTimelineElement> segmentTimeline, long startTime, long elementDuration, int elementRepeatCount, long endTime) {
        int iCeilDivide = elementRepeatCount >= 0 ? elementRepeatCount + 1 : (int) Util.ceilDivide(endTime - startTime, elementDuration);
        for (int i = 0; i < iCeilDivide; i++) {
            segmentTimeline.add(buildSegmentTimelineElement(startTime, elementDuration));
            startTime += elementDuration;
        }
        return startTime;
    }

    private static int b(int firstType, int secondType) {
        if (firstType == -1) {
            return secondType;
        }
        if (secondType == -1) {
            return firstType;
        }
        Assertions.checkState(firstType == secondType);
        return firstType;
    }

    @Nullable
    private static String c(@Nullable String firstLanguage, @Nullable String secondLanguage) {
        if (firstLanguage == null) {
            return secondLanguage;
        }
        if (secondLanguage == null) {
            return firstLanguage;
        }
        Assertions.checkState(firstLanguage.equals(secondLanguage));
        return firstLanguage;
    }

    private static void d(ArrayList<DrmInitData.SchemeData> schemeDatas) {
        for (int size = schemeDatas.size() - 1; size >= 0; size--) {
            DrmInitData.SchemeData schemeData = schemeDatas.get(size);
            if (!schemeData.hasData()) {
                for (int i = 0; i < schemeDatas.size(); i++) {
                    if (schemeDatas.get(i).canReplace(schemeData)) {
                        schemeDatas.remove(size);
                        break;
                    }
                }
            }
        }
    }

    private static long e(long baseUrlAvailabilityTimeOffsetUs, long segmentBaseAvailabilityTimeOffsetUs) {
        if (segmentBaseAvailabilityTimeOffsetUs != C.TIME_UNSET) {
            baseUrlAvailabilityTimeOffsetUs = segmentBaseAvailabilityTimeOffsetUs;
        }
        return baseUrlAvailabilityTimeOffsetUs == Long.MAX_VALUE ? C.TIME_UNSET : baseUrlAvailabilityTimeOffsetUs;
    }

    @Nullable
    private static String f(@Nullable String containerMimeType, @Nullable String codecs) {
        if (MimeTypes.isAudio(containerMimeType)) {
            return MimeTypes.getAudioMediaMimeType(codecs);
        }
        if (MimeTypes.isVideo(containerMimeType)) {
            return MimeTypes.getVideoMediaMimeType(codecs);
        }
        if (MimeTypes.isText(containerMimeType)) {
            return MimeTypes.APPLICATION_RAWCC.equals(containerMimeType) ? MimeTypes.getTextMediaMimeType(codecs) : containerMimeType;
        }
        if (!MimeTypes.APPLICATION_MP4.equals(containerMimeType)) {
            return null;
        }
        String mediaMimeType = MimeTypes.getMediaMimeType(codecs);
        return MimeTypes.TEXT_VTT.equals(mediaMimeType) ? MimeTypes.APPLICATION_MP4VTT : mediaMimeType;
    }

    public static void maybeSkipTag(XmlPullParser xpp) throws XmlPullParserException, IOException {
        if (XmlPullParserUtil.isStartTag(xpp)) {
            int i = 1;
            while (i != 0) {
                xpp.next();
                if (XmlPullParserUtil.isStartTag(xpp)) {
                    i++;
                } else if (XmlPullParserUtil.isEndTag(xpp)) {
                    i--;
                }
            }
        }
    }

    public static int parseCea608AccessibilityChannel(List<Descriptor> accessibilityDescriptors) {
        String str;
        for (int i = 0; i < accessibilityDescriptors.size(); i++) {
            Descriptor descriptor = accessibilityDescriptors.get(i);
            if ("urn:scte:dash:cc:cea-608:2015".equals(descriptor.schemeIdUri) && (str = descriptor.value) != null) {
                Matcher matcher = d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                String strValueOf = String.valueOf(descriptor.value);
                Log.w(b, strValueOf.length() != 0 ? "Unable to parse CEA-608 channel number from: ".concat(strValueOf) : new String("Unable to parse CEA-608 channel number from: "));
            }
        }
        return -1;
    }

    public static int parseCea708AccessibilityChannel(List<Descriptor> accessibilityDescriptors) {
        String str;
        for (int i = 0; i < accessibilityDescriptors.size(); i++) {
            Descriptor descriptor = accessibilityDescriptors.get(i);
            if ("urn:scte:dash:cc:cea-708:2015".equals(descriptor.schemeIdUri) && (str = descriptor.value) != null) {
                Matcher matcher = e.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                String strValueOf = String.valueOf(descriptor.value);
                Log.w(b, strValueOf.length() != 0 ? "Unable to parse CEA-708 service block number from: ".concat(strValueOf) : new String("Unable to parse CEA-708 service block number from: "));
            }
        }
        return -1;
    }

    public static long parseDateTime(XmlPullParser xpp, String name, long defaultValue) throws ParserException {
        String attributeValue = xpp.getAttributeValue(null, name);
        return attributeValue == null ? defaultValue : Util.parseXsDateTime(attributeValue);
    }

    public static Descriptor parseDescriptor(XmlPullParser xpp, String tag) throws XmlPullParserException, IOException {
        String string = parseString(xpp, "schemeIdUri", "");
        String string2 = parseString(xpp, "value", null);
        String string3 = parseString(xpp, "id", null);
        do {
            xpp.next();
        } while (!XmlPullParserUtil.isEndTag(xpp, tag));
        return new Descriptor(string, string2, string3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public static int parseDolbyChannelConfiguration(XmlPullParser xpp) {
        String attributeValue = xpp.getAttributeValue(null, "value");
        if (attributeValue == null) {
            return -1;
        }
        String lowerCase = Ascii.toLowerCase(attributeValue);
        lowerCase.hashCode();
        switch (lowerCase) {
            case "4000":
                return 1;
            case "a000":
                return 2;
            case "f801":
                return 6;
            case "fa01":
                return 8;
            default:
                return -1;
        }
    }

    public static long parseDuration(XmlPullParser xpp, String name, long defaultValue) {
        String attributeValue = xpp.getAttributeValue(null, name);
        return attributeValue == null ? defaultValue : Util.parseXsDuration(attributeValue);
    }

    public static String parseEac3SupplementalProperties(List<Descriptor> supplementalProperties) {
        for (int i = 0; i < supplementalProperties.size(); i++) {
            Descriptor descriptor = supplementalProperties.get(i);
            String str = descriptor.schemeIdUri;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(descriptor.value)) {
                return MimeTypes.AUDIO_E_AC3_JOC;
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && Ac3Util.E_AC3_JOC_CODEC_STRING.equals(descriptor.value)) {
                return MimeTypes.AUDIO_E_AC3_JOC;
            }
        }
        return MimeTypes.AUDIO_E_AC3;
    }

    public static float parseFloat(XmlPullParser xpp, String name, float defaultValue) {
        String attributeValue = xpp.getAttributeValue(null, name);
        return attributeValue == null ? defaultValue : Float.parseFloat(attributeValue);
    }

    public static float parseFrameRate(XmlPullParser xpp, float defaultValue) {
        String attributeValue = xpp.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return defaultValue;
        }
        Matcher matcher = c.matcher(attributeValue);
        if (!matcher.matches()) {
            return defaultValue;
        }
        int i = Integer.parseInt(matcher.group(1));
        String strGroup = matcher.group(2);
        return !TextUtils.isEmpty(strGroup) ? i / Integer.parseInt(strGroup) : i;
    }

    public static int parseInt(XmlPullParser xpp, String name, int defaultValue) {
        String attributeValue = xpp.getAttributeValue(null, name);
        return attributeValue == null ? defaultValue : Integer.parseInt(attributeValue);
    }

    public static long parseLastSegmentNumberSupplementalProperty(List<Descriptor> supplementalProperties) {
        for (int i = 0; i < supplementalProperties.size(); i++) {
            Descriptor descriptor = supplementalProperties.get(i);
            if (Ascii.equalsIgnoreCase("http://dashif.org/guidelines/last-segment-number", descriptor.schemeIdUri)) {
                return Long.parseLong(descriptor.value);
            }
        }
        return -1L;
    }

    public static long parseLong(XmlPullParser xpp, String name, long defaultValue) {
        String attributeValue = xpp.getAttributeValue(null, name);
        return attributeValue == null ? defaultValue : Long.parseLong(attributeValue);
    }

    public static int parseMpegChannelConfiguration(XmlPullParser xpp) {
        int i = parseInt(xpp, "value", -1);
        if (i < 0) {
            return -1;
        }
        int[] iArr = f;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    public static String parseString(XmlPullParser xpp, String name, String defaultValue) {
        String attributeValue = xpp.getAttributeValue(null, name);
        return attributeValue == null ? defaultValue : attributeValue;
    }

    public static String parseText(XmlPullParser xpp, String label) throws XmlPullParserException, IOException {
        String text = "";
        do {
            xpp.next();
            if (xpp.getEventType() == 4) {
                text = xpp.getText();
            } else {
                maybeSkipTag(xpp);
            }
        } while (!XmlPullParserUtil.isEndTag(xpp, label));
        return text;
    }

    public AdaptationSet buildAdaptationSet(int id, int contentType, List<Representation> representations, List<Descriptor> accessibilityDescriptors, List<Descriptor> essentialProperties, List<Descriptor> supplementalProperties) {
        return new AdaptationSet(id, contentType, representations, accessibilityDescriptors, essentialProperties, supplementalProperties);
    }

    public EventMessage buildEvent(String schemeIdUri, String value, long id, long durationMs, byte[] messageData) {
        return new EventMessage(schemeIdUri, value, durationMs, id, messageData);
    }

    public EventStream buildEventStream(String schemeIdUri, String value, long timescale, long[] presentationTimesUs, EventMessage[] events) {
        return new EventStream(schemeIdUri, value, timescale, presentationTimesUs, events);
    }

    public Format buildFormat(@Nullable String id, @Nullable String containerMimeType, int width, int height, float frameRate, int audioChannels, int audioSamplingRate, int bitrate, @Nullable String language, List<Descriptor> roleDescriptors, List<Descriptor> accessibilityDescriptors, @Nullable String codecs, List<Descriptor> essentialProperties, List<Descriptor> supplementalProperties) {
        String str = codecs;
        String strF = f(containerMimeType, str);
        if (MimeTypes.AUDIO_E_AC3.equals(strF)) {
            strF = parseEac3SupplementalProperties(supplementalProperties);
            if (MimeTypes.AUDIO_E_AC3_JOC.equals(strF)) {
                str = Ac3Util.E_AC3_JOC_CODEC_STRING;
            }
        }
        int selectionFlagsFromRoleDescriptors = parseSelectionFlagsFromRoleDescriptors(roleDescriptors);
        Format.Builder language2 = new Format.Builder().setId(id).setContainerMimeType(containerMimeType).setSampleMimeType(strF).setCodecs(str).setPeakBitrate(bitrate).setSelectionFlags(selectionFlagsFromRoleDescriptors).setRoleFlags(parseRoleFlagsFromRoleDescriptors(roleDescriptors) | parseRoleFlagsFromAccessibilityDescriptors(accessibilityDescriptors) | parseRoleFlagsFromProperties(essentialProperties) | parseRoleFlagsFromProperties(supplementalProperties)).setLanguage(language);
        if (MimeTypes.isVideo(strF)) {
            language2.setWidth(width).setHeight(height).setFrameRate(frameRate);
        } else if (MimeTypes.isAudio(strF)) {
            language2.setChannelCount(audioChannels).setSampleRate(audioSamplingRate);
        } else if (MimeTypes.isText(strF)) {
            int cea708AccessibilityChannel = -1;
            if (MimeTypes.APPLICATION_CEA608.equals(strF)) {
                cea708AccessibilityChannel = parseCea608AccessibilityChannel(accessibilityDescriptors);
            } else if (MimeTypes.APPLICATION_CEA708.equals(strF)) {
                cea708AccessibilityChannel = parseCea708AccessibilityChannel(accessibilityDescriptors);
            }
            language2.setAccessibilityChannel(cea708AccessibilityChannel);
        }
        return language2.build();
    }

    public DashManifest buildMediaPresentationDescription(long availabilityStartTime, long durationMs, long minBufferTimeMs, boolean dynamic, long minUpdateTimeMs, long timeShiftBufferDepthMs, long suggestedPresentationDelayMs, long publishTimeMs, @Nullable ProgramInformation programInformation, @Nullable UtcTimingElement utcTiming, @Nullable ServiceDescriptionElement serviceDescription, @Nullable Uri location, List<Period> periods) {
        return new DashManifest(availabilityStartTime, durationMs, minBufferTimeMs, dynamic, minUpdateTimeMs, timeShiftBufferDepthMs, suggestedPresentationDelayMs, publishTimeMs, programInformation, utcTiming, serviceDescription, location, periods);
    }

    public Period buildPeriod(@Nullable String id, long startMs, List<AdaptationSet> adaptationSets, List<EventStream> eventStreams, @Nullable Descriptor assetIdentifier) {
        return new Period(id, startMs, adaptationSets, eventStreams, assetIdentifier);
    }

    public RangedUri buildRangedUri(String urlText, long rangeStart, long rangeLength) {
        return new RangedUri(urlText, rangeStart, rangeLength);
    }

    public Representation buildRepresentation(RepresentationInfo representationInfo, @Nullable String label, @Nullable String extraDrmSchemeType, ArrayList<DrmInitData.SchemeData> extraDrmSchemeDatas, ArrayList<Descriptor> extraInbandEventStreams) {
        Format.Builder builderBuildUpon = representationInfo.format.buildUpon();
        if (label != null) {
            builderBuildUpon.setLabel(label);
        }
        String str = representationInfo.drmSchemeType;
        if (str != null) {
            extraDrmSchemeType = str;
        }
        ArrayList<DrmInitData.SchemeData> arrayList = representationInfo.drmSchemeDatas;
        arrayList.addAll(extraDrmSchemeDatas);
        if (!arrayList.isEmpty()) {
            d(arrayList);
            builderBuildUpon.setDrmInitData(new DrmInitData(extraDrmSchemeType, arrayList));
        }
        ArrayList<Descriptor> arrayList2 = representationInfo.inbandEventStreams;
        arrayList2.addAll(extraInbandEventStreams);
        return Representation.newInstance(representationInfo.revisionId, builderBuildUpon.build(), representationInfo.baseUrls, representationInfo.segmentBase, arrayList2);
    }

    public SegmentBase.SegmentList buildSegmentList(RangedUri initialization, long timescale, long presentationTimeOffset, long startNumber, long duration, @Nullable List<SegmentBase.SegmentTimelineElement> timeline, long availabilityTimeOffsetUs, @Nullable List<RangedUri> segments, long timeShiftBufferDepthMs, long periodStartUnixTimeMs) {
        return new SegmentBase.SegmentList(initialization, timescale, presentationTimeOffset, startNumber, duration, timeline, availabilityTimeOffsetUs, segments, C.msToUs(timeShiftBufferDepthMs), C.msToUs(periodStartUnixTimeMs));
    }

    public SegmentBase.SegmentTemplate buildSegmentTemplate(RangedUri initialization, long timescale, long presentationTimeOffset, long startNumber, long endNumber, long duration, List<SegmentBase.SegmentTimelineElement> timeline, long availabilityTimeOffsetUs, @Nullable UrlTemplate initializationTemplate, @Nullable UrlTemplate mediaTemplate, long timeShiftBufferDepthMs, long periodStartUnixTimeMs) {
        return new SegmentBase.SegmentTemplate(initialization, timescale, presentationTimeOffset, startNumber, endNumber, duration, timeline, availabilityTimeOffsetUs, initializationTemplate, mediaTemplate, C.msToUs(timeShiftBufferDepthMs), C.msToUs(periodStartUnixTimeMs));
    }

    public SegmentBase.SegmentTimelineElement buildSegmentTimelineElement(long startTime, long duration) {
        return new SegmentBase.SegmentTimelineElement(startTime, duration);
    }

    public SegmentBase.SingleSegmentBase buildSingleSegmentBase(RangedUri initialization, long timescale, long presentationTimeOffset, long indexStart, long indexLength) {
        return new SegmentBase.SingleSegmentBase(initialization, timescale, presentationTimeOffset, indexStart, indexLength);
    }

    public UtcTimingElement buildUtcTimingElement(String schemeIdUri, String value) {
        return new UtcTimingElement(schemeIdUri, value);
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0319 A[LOOP:0: B:3:0x007c->B:74:0x0319, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x02da A[EDGE_INSN: B:75:0x02da->B:68:0x02da BREAK  A[LOOP:0: B:3:0x007c->B:74:0x0319], SYNTHETIC] */
    public AdaptationSet parseAdaptationSet(XmlPullParser xpp, List<BaseUrl> parentBaseUrls, @Nullable SegmentBase segmentBase, long periodDurationMs, long baseUrlAvailabilityTimeOffsetUs, long segmentBaseAvailabilityTimeOffsetUs, long periodStartUnixTimeMs, long timeShiftBufferDepthMs) throws XmlPullParserException, IOException {
        String str;
        long j;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Object obj;
        ArrayList arrayList5;
        int i;
        ArrayList<Descriptor> arrayList6;
        long availabilityTimeOffsetUs;
        String str2;
        XmlPullParser xmlPullParser = xpp;
        int i2 = parseInt(xmlPullParser, "id", -1);
        int contentType = parseContentType(xpp);
        String attributeValue = xmlPullParser.getAttributeValue(null, "mimeType");
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "codecs");
        int i3 = parseInt(xmlPullParser, ViewHierarchyConstants.DIMENSION_WIDTH_KEY, -1);
        int i4 = parseInt(xmlPullParser, "height", -1);
        float frameRate = parseFrameRate(xmlPullParser, -1.0f);
        int i5 = parseInt(xmlPullParser, "audioSamplingRate", -1);
        String str3 = "lang";
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "lang");
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "label");
        ArrayList<DrmInitData.SchemeData> arrayList7 = new ArrayList<>();
        ArrayList<Descriptor> arrayList8 = new ArrayList<>();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        SegmentBase segmentTemplate = segmentBase;
        int iB = contentType;
        String str4 = attributeValue3;
        String label = attributeValue4;
        String str5 = null;
        int audioChannelConfiguration = -1;
        boolean z = false;
        long availabilityTimeOffsetUs2 = baseUrlAvailabilityTimeOffsetUs;
        long j2 = segmentBaseAvailabilityTimeOffsetUs;
        while (true) {
            xpp.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "BaseURL")) {
                if (!z) {
                    availabilityTimeOffsetUs2 = parseAvailabilityTimeOffsetUs(xmlPullParser, availabilityTimeOffsetUs2);
                    z = true;
                }
                arrayList14.addAll(parseBaseUrl(xpp, parentBaseUrls));
            } else {
                if (XmlPullParserUtil.isStartTag(xmlPullParser, "ContentProtection")) {
                    Pair<String, DrmInitData.SchemeData> contentProtection = parseContentProtection(xpp);
                    long j3 = j2;
                    Object obj2 = contentProtection.first;
                    if (obj2 != null) {
                        str5 = (String) obj2;
                    }
                    Object obj3 = contentProtection.second;
                    if (obj3 != null) {
                        arrayList7.add((DrmInitData.SchemeData) obj3);
                    }
                    j2 = j3;
                } else {
                    long j4 = j2;
                    if (XmlPullParserUtil.isStartTag(xmlPullParser, "ContentComponent")) {
                        String strC = c(str4, xmlPullParser.getAttributeValue(null, str3));
                        iB = b(iB, parseContentType(xpp));
                        j = availabilityTimeOffsetUs2;
                        arrayList5 = arrayList13;
                        arrayList = arrayList12;
                        arrayList2 = arrayList11;
                        arrayList3 = arrayList10;
                        arrayList4 = arrayList9;
                        arrayList6 = arrayList8;
                        obj = null;
                        str2 = strC;
                    } else {
                        int i6 = iB;
                        String str6 = str4;
                        if (XmlPullParserUtil.isStartTag(xmlPullParser, "Role")) {
                            arrayList10.add(parseDescriptor(xmlPullParser, "Role"));
                        } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "AudioChannelConfiguration")) {
                            audioChannelConfiguration = parseAudioChannelConfiguration(xpp);
                            j = availabilityTimeOffsetUs2;
                            arrayList = arrayList12;
                            arrayList2 = arrayList11;
                            arrayList3 = arrayList10;
                            arrayList4 = arrayList9;
                            arrayList6 = arrayList8;
                            obj = null;
                            iB = i6;
                            str2 = str6;
                            arrayList5 = arrayList13;
                        } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "Accessibility")) {
                            arrayList9.add(parseDescriptor(xmlPullParser, "Accessibility"));
                        } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "EssentialProperty")) {
                            arrayList11.add(parseDescriptor(xmlPullParser, "EssentialProperty"));
                        } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "SupplementalProperty")) {
                            arrayList12.add(parseDescriptor(xmlPullParser, "SupplementalProperty"));
                        } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "Representation")) {
                            j = availabilityTimeOffsetUs2;
                            arrayList = arrayList12;
                            arrayList2 = arrayList11;
                            arrayList3 = arrayList10;
                            arrayList4 = arrayList9;
                            obj = null;
                            RepresentationInfo representation = parseRepresentation(xpp, !arrayList14.isEmpty() ? arrayList14 : parentBaseUrls, attributeValue, attributeValue2, i3, i4, frameRate, audioChannelConfiguration, i5, str6, arrayList3, arrayList4, arrayList2, arrayList, segmentTemplate, periodStartUnixTimeMs, periodDurationMs, j, j4, timeShiftBufferDepthMs);
                            int iB2 = b(i6, MimeTypes.getTrackType(representation.format.sampleMimeType));
                            arrayList5 = arrayList13;
                            arrayList5.add(representation);
                            xmlPullParser = xpp;
                            str2 = str6;
                            arrayList6 = arrayList8;
                            iB = iB2;
                        } else {
                            str = str6;
                            j = availabilityTimeOffsetUs2;
                            arrayList14 = arrayList14;
                            arrayList = arrayList12;
                            arrayList2 = arrayList11;
                            arrayList3 = arrayList10;
                            arrayList4 = arrayList9;
                            ArrayList<Descriptor> arrayList15 = arrayList8;
                            arrayList7 = arrayList7;
                            str3 = str3;
                            obj = null;
                            arrayList5 = arrayList13;
                            xmlPullParser = xpp;
                            if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentBase")) {
                                segmentTemplate = parseSegmentBase(xmlPullParser, (SegmentBase.SingleSegmentBase) segmentTemplate);
                                str2 = str;
                                arrayList6 = arrayList15;
                                j2 = j4;
                                iB = i6;
                                xmlPullParser = xmlPullParser;
                            } else {
                                if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentList")) {
                                    availabilityTimeOffsetUs = parseAvailabilityTimeOffsetUs(xmlPullParser, j4);
                                    i = i6;
                                    segmentTemplate = parseSegmentList(xpp, (SegmentBase.SegmentList) segmentTemplate, periodStartUnixTimeMs, periodDurationMs, j, availabilityTimeOffsetUs, timeShiftBufferDepthMs);
                                } else {
                                    j2 = j4;
                                    i = i6;
                                    if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentTemplate")) {
                                        availabilityTimeOffsetUs = parseAvailabilityTimeOffsetUs(xmlPullParser, j2);
                                        segmentTemplate = parseSegmentTemplate(xpp, (SegmentBase.SegmentTemplate) segmentTemplate, arrayList, periodStartUnixTimeMs, periodDurationMs, j, availabilityTimeOffsetUs, timeShiftBufferDepthMs);
                                    } else {
                                        xmlPullParser = xmlPullParser;
                                        if (XmlPullParserUtil.isStartTag(xmlPullParser, "InbandEventStream")) {
                                            arrayList6 = arrayList15;
                                            arrayList6.add(parseDescriptor(xmlPullParser, "InbandEventStream"));
                                        } else {
                                            arrayList6 = arrayList15;
                                            if (XmlPullParserUtil.isStartTag(xmlPullParser, TextFieldImplKt.LabelId)) {
                                                label = parseLabel(xpp);
                                            } else if (XmlPullParserUtil.isStartTag(xpp)) {
                                                parseAdaptationSetChild(xpp);
                                            }
                                        }
                                        str2 = str;
                                        iB = i;
                                    }
                                }
                                j2 = availabilityTimeOffsetUs;
                                str2 = str;
                                arrayList6 = arrayList15;
                                iB = i;
                            }
                        }
                        str = str6;
                        j = availabilityTimeOffsetUs2;
                        arrayList14 = arrayList14;
                        arrayList = arrayList12;
                        arrayList2 = arrayList11;
                        arrayList3 = arrayList10;
                        arrayList4 = arrayList9;
                        arrayList6 = arrayList8;
                        arrayList7 = arrayList7;
                        str3 = str3;
                        obj = null;
                        i = i6;
                        j2 = j4;
                        arrayList5 = arrayList13;
                        str2 = str;
                        iB = i;
                    }
                    j2 = j4;
                }
                if (XmlPullParserUtil.isEndTag(xmlPullParser, "AdaptationSet")) {
                    break;
                }
                arrayList8 = arrayList6;
                arrayList13 = arrayList5;
                arrayList14 = arrayList14;
                arrayList12 = arrayList;
                arrayList11 = arrayList2;
                arrayList10 = arrayList3;
                arrayList9 = arrayList4;
                arrayList7 = arrayList7;
                str3 = str3;
                str4 = str2;
                availabilityTimeOffsetUs2 = j;
            }
            j = availabilityTimeOffsetUs2;
            arrayList5 = arrayList13;
            arrayList = arrayList12;
            arrayList2 = arrayList11;
            arrayList3 = arrayList10;
            arrayList4 = arrayList9;
            arrayList6 = arrayList8;
            arrayList7 = arrayList7;
            str3 = str3;
            str2 = str4;
            obj = null;
            arrayList14 = arrayList14;
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "AdaptationSet")) {
                break;
                break;
            }
            arrayList8 = arrayList6;
            arrayList13 = arrayList5;
            arrayList14 = arrayList14;
            arrayList12 = arrayList;
            arrayList11 = arrayList2;
            arrayList10 = arrayList3;
            arrayList9 = arrayList4;
            arrayList7 = arrayList7;
            str3 = str3;
            str4 = str2;
            availabilityTimeOffsetUs2 = j;
        }
        List<Representation> arrayList16 = new ArrayList<>(arrayList5.size());
        for (int i7 = 0; i7 < arrayList5.size(); i7++) {
            arrayList16.add(buildRepresentation((RepresentationInfo) arrayList5.get(i7), label, str5, arrayList7, arrayList6));
        }
        return buildAdaptationSet(i2, iB, arrayList16, arrayList4, arrayList2, arrayList);
    }

    public void parseAdaptationSetChild(XmlPullParser xpp) throws XmlPullParserException, IOException {
        maybeSkipTag(xpp);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0012  */
    public int parseAudioChannelConfiguration(XmlPullParser xpp) throws XmlPullParserException, IOException {
        String string = parseString(xpp, "schemeIdUri", null);
        string.hashCode();
        int dolbyChannelConfiguration = -1;
        switch (string) {
            case "urn:mpeg:dash:23003:3:audio_channel_configuration:2011":
                dolbyChannelConfiguration = parseInt(xpp, "value", -1);
                break;
            case "tag:dolby.com,2014:dash:audio_channel_configuration:2011":
            case "urn:dolby:dash:audio_channel_configuration:2011":
                dolbyChannelConfiguration = parseDolbyChannelConfiguration(xpp);
                break;
            case "urn:mpeg:mpegB:cicp:ChannelConfiguration":
                dolbyChannelConfiguration = parseMpegChannelConfiguration(xpp);
                break;
        }
        do {
            xpp.next();
        } while (!XmlPullParserUtil.isEndTag(xpp, "AudioChannelConfiguration"));
        return dolbyChannelConfiguration;
    }

    public long parseAvailabilityTimeOffsetUs(XmlPullParser xpp, long parentAvailabilityTimeOffsetUs) {
        String attributeValue = xpp.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return parentAvailabilityTimeOffsetUs;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public List<BaseUrl> parseBaseUrl(XmlPullParser xpp, List<BaseUrl> parentBaseUrls) throws XmlPullParserException, IOException {
        String attributeValue = xpp.getAttributeValue(null, "dvb:priority");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 1;
        String attributeValue2 = xpp.getAttributeValue(null, "dvb:weight");
        int i2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xpp.getAttributeValue(null, "serviceLocation");
        String text = parseText(xpp, "BaseURL");
        if (attributeValue3 == null) {
            attributeValue3 = text;
        }
        if (UriUtil.isAbsolute(text)) {
            return Lists.newArrayList(new BaseUrl(text, attributeValue3, i, i2));
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < parentBaseUrls.size(); i3++) {
            BaseUrl baseUrl = parentBaseUrls.get(i3);
            arrayList.add(new BaseUrl(UriUtil.resolve(baseUrl.url, text), baseUrl.serviceLocation, baseUrl.priority, baseUrl.weight));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0082  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ea  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v8 */
    public Pair<String, DrmInitData.SchemeData> parseContentProtection(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String attributeValue;
        UUID uuid;
        UUID uuid2;
        ?? attributeValue2;
        ?? BuildPsshAtom;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue3 != null) {
            String lowerCase = Ascii.toLowerCase(attributeValue3);
            lowerCase.hashCode();
            switch (lowerCase) {
                case "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95":
                    uuid = C.PLAYREADY_UUID;
                    attributeValue = null;
                    uuid2 = null;
                    attributeValue2 = uuid2;
                    BuildPsshAtom = uuid2;
                    break;
                case "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed":
                    uuid = C.WIDEVINE_UUID;
                    attributeValue = null;
                    uuid2 = null;
                    attributeValue2 = uuid2;
                    BuildPsshAtom = uuid2;
                    break;
                case "urn:mpeg:dash:mp4protection:2011":
                    attributeValue = xmlPullParser.getAttributeValue(null, "value");
                    String attributeValueIgnorePrefix = XmlPullParserUtil.getAttributeValueIgnorePrefix(xmlPullParser, "default_KID");
                    if (!TextUtils.isEmpty(attributeValueIgnorePrefix) && !"00000000-0000-0000-0000-000000000000".equals(attributeValueIgnorePrefix)) {
                        String[] strArrSplit = attributeValueIgnorePrefix.split("\\s+");
                        UUID[] uuidArr = new UUID[strArrSplit.length];
                        for (int i = 0; i < strArrSplit.length; i++) {
                            uuidArr[i] = UUID.fromString(strArrSplit[i]);
                        }
                        uuid = C.COMMON_PSSH_UUID;
                        attributeValue2 = 0;
                        BuildPsshAtom = PsshAtomUtil.buildPsshAtom(uuid, uuidArr, null);
                        break;
                    } else {
                        uuid = null;
                        uuid2 = uuid;
                        attributeValue2 = uuid2;
                        BuildPsshAtom = uuid2;
                        break;
                    }
                    break;
                default:
                    attributeValue = null;
                    uuid = null;
                    uuid2 = uuid;
                    attributeValue2 = uuid2;
                    BuildPsshAtom = uuid2;
                    break;
            }
        } else {
            attributeValue = null;
            uuid = null;
            uuid2 = uuid;
            attributeValue2 = uuid2;
            BuildPsshAtom = uuid2;
        }
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "ms:laurl")) {
                BuildPsshAtom = BuildPsshAtom;
                attributeValue2 = xmlPullParser.getAttributeValue(null, "licenseUrl");
            } else if (BuildPsshAtom == 0 && XmlPullParserUtil.isStartTagIgnorePrefix(xmlPullParser, "pssh") && xmlPullParser.next() == 4) {
                byte[] bArrDecode = Base64.decode(xmlPullParser.getText(), 0);
                UUID uuid3 = PsshAtomUtil.parseUuid(bArrDecode);
                if (uuid3 == null) {
                    Log.w(b, "Skipping malformed cenc:pssh data");
                    uuid = uuid3;
                    BuildPsshAtom = 0;
                    attributeValue2 = attributeValue2;
                } else {
                    BuildPsshAtom = bArrDecode;
                    uuid = uuid3;
                    attributeValue2 = attributeValue2;
                }
            } else if (BuildPsshAtom == 0) {
                UUID uuid4 = C.PLAYREADY_UUID;
                if (uuid4.equals(uuid) && XmlPullParserUtil.isStartTag(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                    BuildPsshAtom = PsshAtomUtil.buildPsshAtom(uuid4, Base64.decode(xmlPullParser.getText(), 0));
                    attributeValue2 = attributeValue2;
                } else {
                    maybeSkipTag(xmlPullParser);
                    BuildPsshAtom = BuildPsshAtom;
                    attributeValue2 = attributeValue2;
                }
            } else {
                maybeSkipTag(xmlPullParser);
                BuildPsshAtom = BuildPsshAtom;
                attributeValue2 = attributeValue2;
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "ContentProtection"));
        return Pair.create(attributeValue, uuid != null ? new DrmInitData.SchemeData(uuid, attributeValue2, MimeTypes.VIDEO_MP4, BuildPsshAtom) : null);
    }

    public int parseContentType(XmlPullParser xpp) {
        String attributeValue = xpp.getAttributeValue(null, CameraActivity.KEY_CONTENT_TYPE);
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        return "text".equals(attributeValue) ? 3 : -1;
    }

    public Pair<Long, EventMessage> parseEvent(XmlPullParser xpp, String schemeIdUri, String value, long timescale, ByteArrayOutputStream scratchOutputStream) throws XmlPullParserException, IOException {
        long j = parseLong(xpp, "id", 0L);
        long j2 = parseLong(xpp, "duration", C.TIME_UNSET);
        long j3 = parseLong(xpp, "presentationTime", 0L);
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(j2, 1000L, timescale);
        long jScaleLargeTimestamp2 = Util.scaleLargeTimestamp(j3, 1000000L, timescale);
        String string = parseString(xpp, "messageData", null);
        byte[] eventObject = parseEventObject(xpp, scratchOutputStream);
        Long lValueOf = Long.valueOf(jScaleLargeTimestamp2);
        if (string != null) {
            eventObject = Util.getUtf8Bytes(string);
        }
        return Pair.create(lValueOf, buildEvent(schemeIdUri, value, j, jScaleLargeTimestamp, eventObject));
    }

    public byte[] parseEventObject(XmlPullParser xpp, ByteArrayOutputStream scratchOutputStream) throws XmlPullParserException, IOException {
        scratchOutputStream.reset();
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        xmlSerializerNewSerializer.setOutput(scratchOutputStream, Charsets.UTF_8.name());
        xpp.nextToken();
        while (!XmlPullParserUtil.isEndTag(xpp, "Event")) {
            switch (xpp.getEventType()) {
                case 0:
                    xmlSerializerNewSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    xmlSerializerNewSerializer.endDocument();
                    break;
                case 2:
                    xmlSerializerNewSerializer.startTag(xpp.getNamespace(), xpp.getName());
                    for (int i = 0; i < xpp.getAttributeCount(); i++) {
                        xmlSerializerNewSerializer.attribute(xpp.getAttributeNamespace(i), xpp.getAttributeName(i), xpp.getAttributeValue(i));
                    }
                    break;
                case 3:
                    xmlSerializerNewSerializer.endTag(xpp.getNamespace(), xpp.getName());
                    break;
                case 4:
                    xmlSerializerNewSerializer.text(xpp.getText());
                    break;
                case 5:
                    xmlSerializerNewSerializer.cdsect(xpp.getText());
                    break;
                case 6:
                    xmlSerializerNewSerializer.entityRef(xpp.getText());
                    break;
                case 7:
                    xmlSerializerNewSerializer.ignorableWhitespace(xpp.getText());
                    break;
                case 8:
                    xmlSerializerNewSerializer.processingInstruction(xpp.getText());
                    break;
                case 9:
                    xmlSerializerNewSerializer.comment(xpp.getText());
                    break;
                case 10:
                    xmlSerializerNewSerializer.docdecl(xpp.getText());
                    break;
            }
            xpp.nextToken();
        }
        xmlSerializerNewSerializer.flush();
        return scratchOutputStream.toByteArray();
    }

    public EventStream parseEventStream(XmlPullParser xpp) throws XmlPullParserException, IOException {
        String string = parseString(xpp, "schemeIdUri", "");
        String string2 = parseString(xpp, "value", "");
        long j = parseLong(xpp, "timescale", 1L);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        do {
            xpp.next();
            if (XmlPullParserUtil.isStartTag(xpp, "Event")) {
                arrayList.add(parseEvent(xpp, string, string2, j, byteArrayOutputStream));
            } else {
                maybeSkipTag(xpp);
            }
        } while (!XmlPullParserUtil.isEndTag(xpp, "EventStream"));
        long[] jArr = new long[arrayList.size()];
        EventMessage[] eventMessageArr = new EventMessage[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            Pair pair = (Pair) arrayList.get(i);
            jArr[i] = ((Long) pair.first).longValue();
            eventMessageArr[i] = (EventMessage) pair.second;
        }
        return buildEventStream(string, string2, j, jArr, eventMessageArr);
    }

    public RangedUri parseInitialization(XmlPullParser xpp) {
        return parseRangedUrl(xpp, "sourceURL", "range");
    }

    public String parseLabel(XmlPullParser xpp) throws XmlPullParserException, IOException {
        return parseText(xpp, TextFieldImplKt.LabelId);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0179  */
    /* JADX WARN: Code duplicated, block: B:64:0x017d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0180 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x0183  */
    /* JADX WARN: Code duplicated, block: B:69:0x018a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0192  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b9 A[LOOP:0: B:20:0x0082->B:76:0x01b9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x0175 A[SYNTHETIC] */
    public DashManifest parseMediaPresentationDescription(XmlPullParser xpp, BaseUrl documentBaseUrl) throws XmlPullParserException, IOException {
        long j;
        ArrayList arrayList;
        List<BaseUrl> list;
        List<Period> list2;
        Throwable th;
        long j2;
        long dateTime = parseDateTime(xpp, "availabilityStartTime", C.TIME_UNSET);
        long duration = parseDuration(xpp, "mediaPresentationDuration", C.TIME_UNSET);
        long duration2 = parseDuration(xpp, "minBufferTime", C.TIME_UNSET);
        Throwable th2 = null;
        boolean zEquals = "dynamic".equals(xpp.getAttributeValue(null, "type"));
        long duration3 = zEquals ? parseDuration(xpp, "minimumUpdatePeriod", C.TIME_UNSET) : -9223372036854775807L;
        long duration4 = zEquals ? parseDuration(xpp, "timeShiftBufferDepth", C.TIME_UNSET) : -9223372036854775807L;
        long duration5 = zEquals ? parseDuration(xpp, "suggestedPresentationDelay", C.TIME_UNSET) : -9223372036854775807L;
        long dateTime2 = parseDateTime(xpp, "publishTime", C.TIME_UNSET);
        long j3 = zEquals ? 0L : -9223372036854775807L;
        List<BaseUrl> listNewArrayList = Lists.newArrayList(documentBaseUrl);
        List<Period> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        long j4 = zEquals ? -9223372036854775807L : 0L;
        long availabilityTimeOffsetUs = j3;
        ProgramInformation programInformation = null;
        UtcTimingElement utcTiming = null;
        Uri uri = null;
        ServiceDescriptionElement serviceDescription = null;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            xpp.next();
            if (XmlPullParserUtil.isStartTag(xpp, "BaseURL")) {
                if (!z) {
                    availabilityTimeOffsetUs = parseAvailabilityTimeOffsetUs(xpp, availabilityTimeOffsetUs);
                    z = true;
                }
                arrayList3.addAll(parseBaseUrl(xpp, listNewArrayList));
            } else if (XmlPullParserUtil.isStartTag(xpp, "ProgramInformation")) {
                programInformation = parseProgramInformation(xpp);
            } else if (XmlPullParserUtil.isStartTag(xpp, "UTCTiming")) {
                utcTiming = parseUtcTiming(xpp);
            } else if (XmlPullParserUtil.isStartTag(xpp, "Location")) {
                uri = Uri.parse(xpp.nextText());
            } else {
                if (XmlPullParserUtil.isStartTag(xpp, "ServiceDescription")) {
                    serviceDescription = parseServiceDescription(xpp);
                } else {
                    if (!XmlPullParserUtil.isStartTag(xpp, "Period") || z2) {
                        j = availabilityTimeOffsetUs;
                        arrayList = arrayList3;
                        list = listNewArrayList;
                        list2 = arrayList2;
                        th = th2;
                        maybeSkipTag(xpp);
                    } else {
                        j = availabilityTimeOffsetUs;
                        arrayList = arrayList3;
                        list = listNewArrayList;
                        list2 = arrayList2;
                        Pair<Period, Long> period = parsePeriod(xpp, !arrayList3.isEmpty() ? arrayList3 : listNewArrayList, j4, j, dateTime, duration4);
                        Period period2 = (Period) period.first;
                        if (period2.startMs != C.TIME_UNSET) {
                            th = null;
                            long jLongValue = ((Long) period.second).longValue();
                            j4 = jLongValue == C.TIME_UNSET ? -9223372036854775807L : period2.startMs + jLongValue;
                            list2.add(period2);
                        } else {
                            if (!zEquals) {
                                int size = list2.size();
                                StringBuilder sb = new StringBuilder(47);
                                sb.append("Unable to determine start of period ");
                                sb.append(size);
                                throw ParserException.createForMalformedManifest(sb.toString(), null);
                            }
                            list2 = list2;
                            th = null;
                            z2 = true;
                        }
                    }
                    availabilityTimeOffsetUs = j;
                }
                if (XmlPullParserUtil.isEndTag(xpp, "MPD")) {
                    if (duration != C.TIME_UNSET) {
                        j2 = duration;
                    } else if (j4 != C.TIME_UNSET) {
                        j2 = j4;
                    } else {
                        if (!zEquals) {
                            throw ParserException.createForMalformedManifest("Unable to determine duration of static manifest.", th);
                        }
                        j2 = duration;
                    }
                    if (list2.isEmpty()) {
                        throw ParserException.createForMalformedManifest("No periods found.", th);
                    }
                    return buildMediaPresentationDescription(dateTime, j2, duration2, zEquals, duration3, duration4, duration5, dateTime2, programInformation, utcTiming, serviceDescription, uri, list2);
                }
                th2 = th;
                arrayList2 = list2;
                arrayList3 = arrayList;
                listNewArrayList = list;
            }
            arrayList = arrayList3;
            list = listNewArrayList;
            list2 = arrayList2;
            th = th2;
            if (XmlPullParserUtil.isEndTag(xpp, "MPD")) {
                if (duration != C.TIME_UNSET) {
                    j2 = duration;
                } else if (j4 != C.TIME_UNSET) {
                    j2 = j4;
                } else {
                    if (!zEquals) {
                        throw ParserException.createForMalformedManifest("Unable to determine duration of static manifest.", th);
                    }
                    j2 = duration;
                }
                if (list2.isEmpty()) {
                    return buildMediaPresentationDescription(dateTime, j2, duration2, zEquals, duration3, duration4, duration5, dateTime2, programInformation, utcTiming, serviceDescription, uri, list2);
                }
                throw ParserException.createForMalformedManifest("No periods found.", th);
            }
            th2 = th;
            arrayList2 = list2;
            arrayList3 = arrayList;
            listNewArrayList = list;
        }
    }

    public Pair<Period, Long> parsePeriod(XmlPullParser xpp, List<BaseUrl> parentBaseUrls, long defaultStartMs, long baseUrlAvailabilityTimeOffsetUs, long availabilityStartTimeMs, long timeShiftBufferDepthMs) throws XmlPullParserException, IOException {
        ArrayList arrayList;
        List<AdaptationSet> list;
        List<EventStream> list2;
        Object obj;
        long j;
        SegmentBase segmentTemplate;
        Object obj2 = null;
        String attributeValue = xpp.getAttributeValue(null, "id");
        long duration = parseDuration(xpp, "start", defaultStartMs);
        long j2 = C.TIME_UNSET;
        long j3 = availabilityStartTimeMs != C.TIME_UNSET ? availabilityStartTimeMs + duration : -9223372036854775807L;
        long duration2 = parseDuration(xpp, "duration", C.TIME_UNSET);
        List<AdaptationSet> arrayList2 = new ArrayList<>();
        List<EventStream> arrayList3 = new ArrayList<>();
        ArrayList arrayList4 = new ArrayList();
        long availabilityTimeOffsetUs = baseUrlAvailabilityTimeOffsetUs;
        long j4 = -9223372036854775807L;
        SegmentBase segmentBase = null;
        Descriptor descriptor = null;
        boolean z = false;
        while (true) {
            xpp.next();
            if (XmlPullParserUtil.isStartTag(xpp, "BaseURL")) {
                if (!z) {
                    availabilityTimeOffsetUs = parseAvailabilityTimeOffsetUs(xpp, availabilityTimeOffsetUs);
                    z = true;
                }
                arrayList4.addAll(parseBaseUrl(xpp, parentBaseUrls));
                list2 = arrayList3;
                arrayList = arrayList4;
                j = j2;
                obj = obj2;
                list = arrayList2;
            } else {
                if (XmlPullParserUtil.isStartTag(xpp, "AdaptationSet")) {
                    availabilityTimeOffsetUs = availabilityTimeOffsetUs;
                    arrayList = arrayList4;
                    list = arrayList2;
                    list.add(parseAdaptationSet(xpp, !arrayList4.isEmpty() ? arrayList4 : parentBaseUrls, segmentBase, duration2, availabilityTimeOffsetUs, j4, j3, timeShiftBufferDepthMs));
                    list2 = arrayList3;
                } else {
                    availabilityTimeOffsetUs = availabilityTimeOffsetUs;
                    List<EventStream> list3 = arrayList3;
                    arrayList = arrayList4;
                    list = arrayList2;
                    if (XmlPullParserUtil.isStartTag(xpp, "EventStream")) {
                        list3.add(parseEventStream(xpp));
                        list2 = list3;
                    } else if (XmlPullParserUtil.isStartTag(xpp, "SegmentBase")) {
                        list2 = list3;
                        segmentBase = parseSegmentBase(xpp, null);
                        obj = null;
                        availabilityTimeOffsetUs = availabilityTimeOffsetUs;
                        j = C.TIME_UNSET;
                    } else {
                        list2 = list3;
                        if (XmlPullParserUtil.isStartTag(xpp, "SegmentList")) {
                            long availabilityTimeOffsetUs2 = parseAvailabilityTimeOffsetUs(xpp, C.TIME_UNSET);
                            obj = null;
                            segmentTemplate = parseSegmentList(xpp, null, j3, duration2, availabilityTimeOffsetUs, availabilityTimeOffsetUs2, timeShiftBufferDepthMs);
                            j4 = availabilityTimeOffsetUs2;
                            j = C.TIME_UNSET;
                        } else {
                            obj = null;
                            if (XmlPullParserUtil.isStartTag(xpp, "SegmentTemplate")) {
                                long availabilityTimeOffsetUs3 = parseAvailabilityTimeOffsetUs(xpp, C.TIME_UNSET);
                                j = -9223372036854775807L;
                                segmentTemplate = parseSegmentTemplate(xpp, null, ImmutableList.of(), j3, duration2, availabilityTimeOffsetUs, availabilityTimeOffsetUs3, timeShiftBufferDepthMs);
                                j4 = availabilityTimeOffsetUs3;
                            } else {
                                j = C.TIME_UNSET;
                                if (XmlPullParserUtil.isStartTag(xpp, "AssetIdentifier")) {
                                    descriptor = parseDescriptor(xpp, "AssetIdentifier");
                                } else {
                                    maybeSkipTag(xpp);
                                }
                                availabilityTimeOffsetUs = availabilityTimeOffsetUs;
                            }
                        }
                        segmentBase = segmentTemplate;
                    }
                }
                obj = null;
                j = C.TIME_UNSET;
                availabilityTimeOffsetUs = availabilityTimeOffsetUs;
            }
            if (XmlPullParserUtil.isEndTag(xpp, "Period")) {
                return Pair.create(buildPeriod(attributeValue, duration, list, list2, descriptor), Long.valueOf(duration2));
            }
            arrayList2 = list;
            arrayList4 = arrayList;
            obj2 = obj;
            arrayList3 = list2;
            j2 = j;
        }
    }

    public ProgramInformation parseProgramInformation(XmlPullParser xpp) throws XmlPullParserException, IOException {
        String strNextText = null;
        String string = parseString(xpp, "moreInformationURL", null);
        String string2 = parseString(xpp, "lang", null);
        String strNextText2 = null;
        String strNextText3 = null;
        while (true) {
            xpp.next();
            if (XmlPullParserUtil.isStartTag(xpp, "Title")) {
                strNextText = xpp.nextText();
            } else if (XmlPullParserUtil.isStartTag(xpp, "Source")) {
                strNextText2 = xpp.nextText();
            } else if (XmlPullParserUtil.isStartTag(xpp, ExifInterface.TAG_COPYRIGHT)) {
                strNextText3 = xpp.nextText();
            } else {
                maybeSkipTag(xpp);
            }
            String str = strNextText3;
            if (XmlPullParserUtil.isEndTag(xpp, "ProgramInformation")) {
                return new ProgramInformation(strNextText, strNextText2, str, string, string2);
            }
            strNextText3 = str;
        }
    }

    public RangedUri parseRangedUrl(XmlPullParser xpp, String urlAttribute, String rangeAttribute) {
        long j;
        long j2;
        String attributeValue = xpp.getAttributeValue(null, urlAttribute);
        String attributeValue2 = xpp.getAttributeValue(null, rangeAttribute);
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            j = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j2 = (Long.parseLong(strArrSplit[1]) - j) + 1;
            }
            return buildRangedUri(attributeValue, j, j2);
        }
        j = 0;
        j2 = -1;
        return buildRangedUri(attributeValue, j, j2);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01e2 A[LOOP:0: B:3:0x006a->B:57:0x01e2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0190 A[EDGE_INSN: B:58:0x0190->B:47:0x0190 BREAK  A[LOOP:0: B:3:0x006a->B:57:0x01e2], SYNTHETIC] */
    public RepresentationInfo parseRepresentation(XmlPullParser xmlPullParser, List<BaseUrl> list, @Nullable String str, @Nullable String str2, int i, int i2, float f2, int i3, int i4, @Nullable String str3, List<Descriptor> list2, List<Descriptor> list3, List<Descriptor> list4, List<Descriptor> list5, @Nullable SegmentBase segmentBase, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long j6;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        long availabilityTimeOffsetUs;
        ArrayList arrayList6;
        SegmentBase singleSegmentBase;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        String attributeValue = xmlPullParser.getAttributeValue(null, "id");
        int i5 = parseInt(xmlPullParser, "bandwidth", -1);
        String string = parseString(xmlPullParser, "mimeType", str);
        String string2 = parseString(xmlPullParser, "codecs", str2);
        int i6 = parseInt(xmlPullParser, ViewHierarchyConstants.DIMENSION_WIDTH_KEY, i);
        int i7 = parseInt(xmlPullParser, "height", i2);
        float frameRate = parseFrameRate(xmlPullParser, f2);
        int i8 = parseInt(xmlPullParser, "audioSamplingRate", i4);
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList(list4);
        ArrayList arrayList13 = new ArrayList(list5);
        int audioChannelConfiguration = i3;
        long availabilityTimeOffsetUs2 = j3;
        long j7 = j4;
        String str4 = null;
        boolean z = false;
        SegmentBase segmentTemplate = segmentBase;
        ArrayList arrayList14 = new ArrayList();
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "BaseURL")) {
                if (!z) {
                    availabilityTimeOffsetUs2 = parseAvailabilityTimeOffsetUs(xmlPullParser, availabilityTimeOffsetUs2);
                    z = true;
                }
                arrayList14.addAll(parseBaseUrl(xmlPullParser, list));
            } else {
                if (XmlPullParserUtil.isStartTag(xmlPullParser, "AudioChannelConfiguration")) {
                    singleSegmentBase = segmentTemplate;
                    audioChannelConfiguration = parseAudioChannelConfiguration(xmlPullParser);
                    arrayList4 = arrayList11;
                    arrayList5 = arrayList13;
                    arrayList9 = arrayList14;
                } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentBase")) {
                    segmentTemplate = parseSegmentBase(xmlPullParser, (SegmentBase.SingleSegmentBase) segmentTemplate);
                } else {
                    if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentList")) {
                        availabilityTimeOffsetUs = parseAvailabilityTimeOffsetUs(xmlPullParser, j7);
                        j6 = availabilityTimeOffsetUs2;
                        arrayList8 = arrayList14;
                        arrayList = arrayList13;
                        arrayList2 = arrayList11;
                        arrayList3 = arrayList12;
                        segmentTemplate = parseSegmentList(xmlPullParser, (SegmentBase.SegmentList) segmentTemplate, j, j2, j6, availabilityTimeOffsetUs, j5);
                    } else {
                        j6 = availabilityTimeOffsetUs2;
                        ArrayList arrayList15 = arrayList14;
                        arrayList = arrayList13;
                        arrayList2 = arrayList11;
                        arrayList3 = arrayList12;
                        if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentTemplate")) {
                            availabilityTimeOffsetUs = parseAvailabilityTimeOffsetUs(xmlPullParser, j7);
                            segmentTemplate = parseSegmentTemplate(xmlPullParser, (SegmentBase.SegmentTemplate) segmentTemplate, list5, j, j2, j6, availabilityTimeOffsetUs, j5);
                            arrayList8 = arrayList15;
                        } else {
                            arrayList10 = arrayList10;
                            if (XmlPullParserUtil.isStartTag(xmlPullParser, "ContentProtection")) {
                                Pair<String, DrmInitData.SchemeData> contentProtection = parseContentProtection(xmlPullParser);
                                Object obj = contentProtection.first;
                                if (obj != null) {
                                    str4 = (String) obj;
                                }
                                Object obj2 = contentProtection.second;
                                if (obj2 != null) {
                                    arrayList10.add((DrmInitData.SchemeData) obj2);
                                }
                                arrayList7 = arrayList15;
                                availabilityTimeOffsetUs2 = j6;
                                arrayList5 = arrayList;
                                arrayList4 = arrayList2;
                                arrayList12 = arrayList3;
                                arrayList6 = arrayList7;
                            } else {
                                if (XmlPullParserUtil.isStartTag(xmlPullParser, "InbandEventStream")) {
                                    arrayList4 = arrayList2;
                                    arrayList4.add(parseDescriptor(xmlPullParser, "InbandEventStream"));
                                    arrayList5 = arrayList;
                                    arrayList12 = arrayList3;
                                } else {
                                    arrayList4 = arrayList2;
                                    if (XmlPullParserUtil.isStartTag(xmlPullParser, "EssentialProperty")) {
                                        arrayList12 = arrayList3;
                                        arrayList12.add(parseDescriptor(xmlPullParser, "EssentialProperty"));
                                        arrayList5 = arrayList;
                                    } else {
                                        arrayList12 = arrayList3;
                                        if (XmlPullParserUtil.isStartTag(xmlPullParser, "SupplementalProperty")) {
                                            arrayList5 = arrayList;
                                            arrayList5.add(parseDescriptor(xmlPullParser, "SupplementalProperty"));
                                        } else {
                                            arrayList5 = arrayList;
                                            maybeSkipTag(xmlPullParser);
                                        }
                                    }
                                }
                                audioChannelConfiguration = audioChannelConfiguration;
                                availabilityTimeOffsetUs2 = j6;
                                arrayList6 = arrayList15;
                            }
                        }
                        singleSegmentBase = segmentTemplate;
                        arrayList9 = arrayList6;
                    }
                    j7 = availabilityTimeOffsetUs;
                    arrayList7 = arrayList8;
                    availabilityTimeOffsetUs2 = j6;
                    arrayList5 = arrayList;
                    arrayList4 = arrayList2;
                    arrayList12 = arrayList3;
                    arrayList6 = arrayList7;
                    singleSegmentBase = segmentTemplate;
                    arrayList9 = arrayList6;
                }
                if (XmlPullParserUtil.isEndTag(xmlPullParser, "Representation")) {
                    break;
                }
                arrayList13 = arrayList5;
                arrayList11 = arrayList4;
                arrayList10 = arrayList10;
                segmentTemplate = singleSegmentBase;
                audioChannelConfiguration = audioChannelConfiguration;
                arrayList14 = arrayList9;
            }
            audioChannelConfiguration = audioChannelConfiguration;
            singleSegmentBase = segmentTemplate;
            arrayList4 = arrayList11;
            arrayList5 = arrayList13;
            arrayList9 = arrayList14;
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "Representation")) {
                break;
                break;
            }
            arrayList13 = arrayList5;
            arrayList11 = arrayList4;
            arrayList10 = arrayList10;
            segmentTemplate = singleSegmentBase;
            audioChannelConfiguration = audioChannelConfiguration;
            arrayList14 = arrayList9;
        }
        ArrayList arrayList16 = arrayList4;
        Format formatBuildFormat = buildFormat(attributeValue, string, i6, i7, frameRate, audioChannelConfiguration, i8, i5, str3, list2, list3, string2, arrayList12, arrayList5);
        if (singleSegmentBase == null) {
            singleSegmentBase = new SegmentBase.SingleSegmentBase();
        }
        boolean zIsEmpty = arrayList9.isEmpty();
        List list6 = arrayList9;
        if (zIsEmpty) {
            list6 = list;
        }
        return new RepresentationInfo(formatBuildFormat, list6, singleSegmentBase, str4, arrayList10, arrayList16, -1L);
    }

    public int parseRoleFlagsFromAccessibilityDescriptors(List<Descriptor> accessibilityDescriptors) {
        int tvaAudioPurposeCsValue;
        int i = 0;
        for (int i2 = 0; i2 < accessibilityDescriptors.size(); i2++) {
            Descriptor descriptor = accessibilityDescriptors.get(i2);
            if (Ascii.equalsIgnoreCase("urn:mpeg:dash:role:2011", descriptor.schemeIdUri)) {
                tvaAudioPurposeCsValue = parseRoleFlagsFromDashRoleScheme(descriptor.value);
            } else {
                if (Ascii.equalsIgnoreCase("urn:tva:metadata:cs:AudioPurposeCS:2007", descriptor.schemeIdUri)) {
                    tvaAudioPurposeCsValue = parseTvaAudioPurposeCsValue(descriptor.value);
                }
            }
            i |= tvaAudioPurposeCsValue;
        }
        return i;
    }

    public int parseRoleFlagsFromDashRoleScheme(@Nullable String value) {
        if (value == null) {
            return 0;
        }
        switch (value) {
            case "subtitle":
            case "forced_subtitle":
                return 128;
            case "description":
                return 512;
            case "enhanced-audio-intelligibility":
                return 2048;
            case "alternate":
                return 2;
            case "dub":
                return 16;
            case "main":
                return 1;
            case "sign":
                return 256;
            case "caption":
                return 64;
            case "commentary":
                return 8;
            case "emergency":
                return 32;
            case "supplementary":
                return 4;
            default:
                return 0;
        }
    }

    public int parseRoleFlagsFromProperties(List<Descriptor> accessibilityDescriptors) {
        int i = 0;
        for (int i2 = 0; i2 < accessibilityDescriptors.size(); i2++) {
            if (Ascii.equalsIgnoreCase("http://dashif.org/guidelines/trickmode", accessibilityDescriptors.get(i2).schemeIdUri)) {
                i |= 16384;
            }
        }
        return i;
    }

    public int parseRoleFlagsFromRoleDescriptors(List<Descriptor> roleDescriptors) {
        int roleFlagsFromDashRoleScheme = 0;
        for (int i = 0; i < roleDescriptors.size(); i++) {
            Descriptor descriptor = roleDescriptors.get(i);
            if (Ascii.equalsIgnoreCase("urn:mpeg:dash:role:2011", descriptor.schemeIdUri)) {
                roleFlagsFromDashRoleScheme |= parseRoleFlagsFromDashRoleScheme(descriptor.value);
            }
        }
        return roleFlagsFromDashRoleScheme;
    }

    public SegmentBase.SingleSegmentBase parseSegmentBase(XmlPullParser xpp, @Nullable SegmentBase.SingleSegmentBase parent) throws XmlPullParserException, IOException {
        long j;
        long j2;
        long j3 = parseLong(xpp, "timescale", parent != null ? parent.b : 1L);
        long j4 = parseLong(xpp, "presentationTimeOffset", parent != null ? parent.c : 0L);
        long j5 = parent != null ? parent.d : 0L;
        long j6 = parent != null ? parent.e : 0L;
        String attributeValue = xpp.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            long j7 = Long.parseLong(strArrSplit[0]);
            j = (Long.parseLong(strArrSplit[1]) - j7) + 1;
            j2 = j7;
        } else {
            j = j6;
            j2 = j5;
        }
        RangedUri initialization = parent != null ? parent.a : null;
        do {
            xpp.next();
            if (XmlPullParserUtil.isStartTag(xpp, "Initialization")) {
                initialization = parseInitialization(xpp);
            } else {
                maybeSkipTag(xpp);
            }
        } while (!XmlPullParserUtil.isEndTag(xpp, "SegmentBase"));
        return buildSingleSegmentBase(initialization, j3, j4, j2, j);
    }

    public SegmentBase.SegmentList parseSegmentList(XmlPullParser xpp, @Nullable SegmentBase.SegmentList parent, long periodStartUnixTimeMs, long periodDurationMs, long baseUrlAvailabilityTimeOffsetUs, long segmentBaseAvailabilityTimeOffsetUs, long timeShiftBufferDepthMs) throws XmlPullParserException, IOException {
        long j = parseLong(xpp, "timescale", parent != null ? parent.b : 1L);
        long j2 = parseLong(xpp, "presentationTimeOffset", parent != null ? parent.c : 0L);
        long j3 = parseLong(xpp, "duration", parent != null ? parent.e : C.TIME_UNSET);
        long j4 = parseLong(xpp, "startNumber", parent != null ? parent.d : 1L);
        long jE = e(baseUrlAvailabilityTimeOffsetUs, segmentBaseAvailabilityTimeOffsetUs);
        List<SegmentBase.SegmentTimelineElement> segmentTimeline = null;
        List<RangedUri> arrayList = null;
        RangedUri initialization = null;
        do {
            xpp.next();
            if (XmlPullParserUtil.isStartTag(xpp, "Initialization")) {
                initialization = parseInitialization(xpp);
            } else if (XmlPullParserUtil.isStartTag(xpp, "SegmentTimeline")) {
                segmentTimeline = parseSegmentTimeline(xpp, j, periodDurationMs);
            } else if (XmlPullParserUtil.isStartTag(xpp, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(parseSegmentUrl(xpp));
            } else {
                maybeSkipTag(xpp);
            }
        } while (!XmlPullParserUtil.isEndTag(xpp, "SegmentList"));
        if (parent != null) {
            if (initialization == null) {
                initialization = parent.a;
            }
            if (segmentTimeline == null) {
                segmentTimeline = parent.f;
            }
            if (arrayList == null) {
                arrayList = parent.j;
            }
        }
        return buildSegmentList(initialization, j, j2, j4, j3, segmentTimeline, jE, arrayList, timeShiftBufferDepthMs, periodStartUnixTimeMs);
    }

    public SegmentBase.SegmentTemplate parseSegmentTemplate(XmlPullParser xpp, @Nullable SegmentBase.SegmentTemplate parent, List<Descriptor> adaptationSetSupplementalProperties, long periodStartUnixTimeMs, long periodDurationMs, long baseUrlAvailabilityTimeOffsetUs, long segmentBaseAvailabilityTimeOffsetUs, long timeShiftBufferDepthMs) throws XmlPullParserException, IOException {
        long j = parseLong(xpp, "timescale", parent != null ? parent.b : 1L);
        long j2 = parseLong(xpp, "presentationTimeOffset", parent != null ? parent.c : 0L);
        long j3 = parseLong(xpp, "duration", parent != null ? parent.e : C.TIME_UNSET);
        long j4 = parseLong(xpp, "startNumber", parent != null ? parent.d : 1L);
        long lastSegmentNumberSupplementalProperty = parseLastSegmentNumberSupplementalProperty(adaptationSetSupplementalProperties);
        long jE = e(baseUrlAvailabilityTimeOffsetUs, segmentBaseAvailabilityTimeOffsetUs);
        List<SegmentBase.SegmentTimelineElement> segmentTimeline = null;
        UrlTemplate urlTemplate = parseUrlTemplate(xpp, "media", parent != null ? parent.k : null);
        UrlTemplate urlTemplate2 = parseUrlTemplate(xpp, "initialization", parent != null ? parent.j : null);
        RangedUri initialization = null;
        do {
            xpp.next();
            if (XmlPullParserUtil.isStartTag(xpp, "Initialization")) {
                initialization = parseInitialization(xpp);
            } else if (XmlPullParserUtil.isStartTag(xpp, "SegmentTimeline")) {
                segmentTimeline = parseSegmentTimeline(xpp, j, periodDurationMs);
            } else {
                maybeSkipTag(xpp);
            }
        } while (!XmlPullParserUtil.isEndTag(xpp, "SegmentTemplate"));
        if (parent != null) {
            if (initialization == null) {
                initialization = parent.a;
            }
            if (segmentTimeline == null) {
                segmentTimeline = parent.f;
            }
        }
        return buildSegmentTemplate(initialization, j, j2, j4, lastSegmentNumberSupplementalProperty, j3, segmentTimeline, jE, urlTemplate2, urlTemplate, timeShiftBufferDepthMs, periodStartUnixTimeMs);
    }

    public List<SegmentBase.SegmentTimelineElement> parseSegmentTimeline(XmlPullParser xpp, long timescale, long periodDurationMs) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jA = 0;
        long j = -9223372036854775807L;
        boolean z = false;
        int i = 0;
        do {
            xpp.next();
            if (XmlPullParserUtil.isStartTag(xpp, ExifInterface.LATITUDE_SOUTH)) {
                long j2 = parseLong(xpp, "t", C.TIME_UNSET);
                if (z) {
                    jA = a(arrayList, jA, j, i, j2);
                }
                if (j2 == C.TIME_UNSET) {
                    j2 = jA;
                }
                j = parseLong(xpp, GoogleApiAvailabilityLight.a, C.TIME_UNSET);
                i = parseInt(xpp, "r", 0);
                jA = j2;
                z = true;
            } else {
                maybeSkipTag(xpp);
            }
        } while (!XmlPullParserUtil.isEndTag(xpp, "SegmentTimeline"));
        if (z) {
            a(arrayList, jA, j, i, Util.scaleLargeTimestamp(periodDurationMs, timescale, 1000L));
        }
        return arrayList;
    }

    public RangedUri parseSegmentUrl(XmlPullParser xpp) {
        return parseRangedUrl(xpp, "media", "mediaRange");
    }

    public int parseSelectionFlagsFromDashRoleScheme(@Nullable String value) {
        if (value == null) {
            return 0;
        }
        if (value.equals("forced_subtitle")) {
            return 2;
        }
        return !value.equals("main") ? 0 : 1;
    }

    public int parseSelectionFlagsFromRoleDescriptors(List<Descriptor> roleDescriptors) {
        int selectionFlagsFromDashRoleScheme = 0;
        for (int i = 0; i < roleDescriptors.size(); i++) {
            Descriptor descriptor = roleDescriptors.get(i);
            if (Ascii.equalsIgnoreCase("urn:mpeg:dash:role:2011", descriptor.schemeIdUri)) {
                selectionFlagsFromDashRoleScheme |= parseSelectionFlagsFromDashRoleScheme(descriptor.value);
            }
        }
        return selectionFlagsFromDashRoleScheme;
    }

    public ServiceDescriptionElement parseServiceDescription(XmlPullParser xpp) throws XmlPullParserException, IOException {
        long j = -9223372036854775807L;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        float f2 = -3.4028235E38f;
        float f3 = -3.4028235E38f;
        while (true) {
            xpp.next();
            if (XmlPullParserUtil.isStartTag(xpp, "Latency")) {
                j = parseLong(xpp, "target", C.TIME_UNSET);
                j2 = parseLong(xpp, "min", C.TIME_UNSET);
                j3 = parseLong(xpp, "max", C.TIME_UNSET);
            } else if (XmlPullParserUtil.isStartTag(xpp, "PlaybackRate")) {
                f2 = parseFloat(xpp, "min", -3.4028235E38f);
                f3 = parseFloat(xpp, "max", -3.4028235E38f);
            }
            long j4 = j;
            long j5 = j2;
            long j6 = j3;
            float f4 = f2;
            float f5 = f3;
            if (XmlPullParserUtil.isEndTag(xpp, "ServiceDescription")) {
                return new ServiceDescriptionElement(j4, j5, j6, f4, f5);
            }
            j = j4;
            j2 = j5;
            j3 = j6;
            f2 = f4;
            f3 = f5;
        }
    }

    public int parseTvaAudioPurposeCsValue(@Nullable String value) {
        if (value == null) {
            return 0;
        }
        byte b2 = -1;
        switch (value.hashCode()) {
            case 49:
                if (value.equals("1")) {
                    b2 = 0;
                }
                break;
            case 50:
                if (value.equals("2")) {
                    b2 = 1;
                }
                break;
            case 51:
                if (value.equals("3")) {
                    b2 = 2;
                }
                break;
            case 52:
                if (value.equals("4")) {
                    b2 = 3;
                }
                break;
            case 54:
                if (value.equals("6")) {
                    b2 = 4;
                }
                break;
        }
        switch (b2) {
            case 0:
                return 512;
            case 1:
                return 2048;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 1;
            default:
                return 0;
        }
    }

    @Nullable
    public UrlTemplate parseUrlTemplate(XmlPullParser xpp, String name, @Nullable UrlTemplate defaultValue) {
        String attributeValue = xpp.getAttributeValue(null, name);
        return attributeValue != null ? UrlTemplate.compile(attributeValue) : defaultValue;
    }

    public UtcTimingElement parseUtcTiming(XmlPullParser xpp) {
        return buildUtcTimingElement(xpp.getAttributeValue(null, "schemeIdUri"), xpp.getAttributeValue(null, "value"));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
    public DashManifest parse(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.a.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return parseMediaPresentationDescription(xmlPullParserNewPullParser, new BaseUrl(uri.toString()));
            }
            throw ParserException.createForMalformedManifest("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e2) {
            throw ParserException.createForMalformedManifest(null, e2);
        }
    }
}
