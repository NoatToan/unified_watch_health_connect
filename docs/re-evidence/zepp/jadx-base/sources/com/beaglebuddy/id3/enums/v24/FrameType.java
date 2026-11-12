package com.beaglebuddy.id3.enums.v24;

import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodyAttachedPicture;
import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodyAudioEncryption;
import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodyAudioSeekPointIndex;
import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodyComments;
import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodyCommercial;
import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodyEncryptionMethodRegistration;
import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodyEqualization;
import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodyEventTimingCodes;
import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodyGeneralEncapsulatedObject;
import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodyGroupIdentificationRegistration;
import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodyLinkedInformation;
import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodyMPEGLocationLookupTable;
import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodyMusicCDIdentifier;
import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodyOwnership;
import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodyPlayCounter;
import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodyPopularimeter;
import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodyPositionSynchronization;
import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodyPrivate;
import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodyRecommendedBufferSize;
import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodyRelativeVolumeAdjustment;
import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodyReverb;
import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodySeek;
import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodySignature;
import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodySynchronizedLyricsText;
import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodySynchronizedTempoCodes;
import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodyTermsOfUse;
import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodyTextInformation;
import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodyURLLink;
import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodyUniqueFileIdentifier;
import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodyUnsynchronizedLyrics;
import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodyUserDefinedTextInformation;
import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodyUserDefinedURLLink;
import com.facebook.share.internal.ShareConstants;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.twitter.sdk.android.tweetcomposer.g;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import org.cybergarage.upnp.std.av.server.object.format.ID3Frame;

/* JADX INFO: loaded from: classes2.dex */
public enum FrameType {
    AUDIO_ENCRYPTION("AENC", "audio encryption", ID3v24FrameBodyAudioEncryption.class),
    ATTACHED_PICTURE(ApicFrame.ID, "attached picture", ID3v24FrameBodyAttachedPicture.class),
    AUDIO_SEEK_POINT_INDEX("ASPI", "audio seek point index", ID3v24FrameBodyAudioSeekPointIndex.class),
    COMMENTS(CommentFrame.ID, "comments", ID3v24FrameBodyComments.class),
    COMMERCIAL("COMR", "commercial", ID3v24FrameBodyCommercial.class),
    ENCRYPTION_METHOD_REGISTRATION("ENCR", "encryption method registration", ID3v24FrameBodyEncryptionMethodRegistration.class),
    EQUALIZATION("EQU2", "equalization (2)", ID3v24FrameBodyEqualization.class),
    EVENT_TIMING_CODES("ETCO", "event timing codes", ID3v24FrameBodyEventTimingCodes.class),
    GENERAL_ENCAPSULATED_OBJECT(GeobFrame.ID, "general encapsulated object", ID3v24FrameBodyGeneralEncapsulatedObject.class),
    GROUP_IDENTIFICATION_REGISTRATION("GRID", "group identification registration", ID3v24FrameBodyGroupIdentificationRegistration.class),
    LINKED_INFORMATION(ShareConstants.CONTENT_URL, "linked information", ID3v24FrameBodyLinkedInformation.class),
    MUSIC_CD_IDENTIFIER("MCDI", "music cd identifier", ID3v24FrameBodyMusicCDIdentifier.class),
    MPEG_LOCATION_LOOKUP_TABLE(MlltFrame.ID, "mpeg location lookup table", ID3v24FrameBodyMPEGLocationLookupTable.class),
    OWNERSHIP("OWNE", "ownership", ID3v24FrameBodyOwnership.class),
    PLAY_COUNTER("PCNT", "play counter", ID3v24FrameBodyPlayCounter.class),
    POPULARIMETER("POPM", "popularimeter", ID3v24FrameBodyPopularimeter.class),
    POSITION_SYNCHRONIZATION("POSS", "position synchronization", ID3v24FrameBodyPositionSynchronization.class),
    PRIVATE(PrivFrame.ID, "private", ID3v24FrameBodyPrivate.class),
    RECOMMENDED_BUFFER_SIZE("RBUF", "recommended buffer size", ID3v24FrameBodyRecommendedBufferSize.class),
    RELATIVE_VOLUME_ADJUSTMENT("RVA2", "relative volume adjustment (2)", ID3v24FrameBodyRelativeVolumeAdjustment.class),
    REVERB("RVRB", "reverb settings", ID3v24FrameBodyReverb.class),
    SEEK_FRAME("SEEK", "seek frame", ID3v24FrameBodySeek.class),
    SIGNATURE("SIGN", "signature frame", ID3v24FrameBodySignature.class),
    SYNCHRONIZED_LYRIC_TEXT("SYLT", "synchronized lyric/text", ID3v24FrameBodySynchronizedLyricsText.class),
    SYNCHRONIZED_TEMPO_CODES("SYTC", "synchronized tempo codes", ID3v24FrameBodySynchronizedTempoCodes.class),
    ALBUM_TITLE("TALB", "album/movie/show title", ID3v24FrameBodyTextInformation.class),
    BEATS_PER_MINUTE("TBPM", "bpm (beats per minute)", ID3v24FrameBodyTextInformation.class),
    COMPOSER("TCOM", g.c, ID3v24FrameBodyTextInformation.class),
    CONTENT_TYPE("TCON", "content type", ID3v24FrameBodyTextInformation.class),
    COPYRIGHT_MESSAGE("TCOP", "copyright message", ID3v24FrameBodyTextInformation.class),
    ENCODING_TIME("TDEN", "encoding date/time", ID3v24FrameBodyTextInformation.class),
    PLAYLIST_DELAY("TDLY", "playlist delay", ID3v24FrameBodyTextInformation.class),
    ORIGINAL_RELEASE_TIME("TDOR", "original release date/time", ID3v24FrameBodyTextInformation.class),
    RECORDING_TIME("TDRC", "recording date/time", ID3v24FrameBodyTextInformation.class),
    RELEASE_TIME("TDRL", "release date/time", ID3v24FrameBodyTextInformation.class),
    TAGGING_TIME("TDTG", "tagging date/time", ID3v24FrameBodyTextInformation.class),
    ENCODED_BY("TENC", "encoded by", ID3v24FrameBodyTextInformation.class),
    LYRICIST("TEXT", "lyricist/text writer", ID3v24FrameBodyTextInformation.class),
    FILE_TYPE("TFLT", "file type", ID3v24FrameBodyTextInformation.class),
    INVOLVED_PEOPLE_LIST("TIPL", "involved people list", ID3v24FrameBodyTextInformation.class),
    CONTENT_GROUP_DESCRIPTION(ID3Frame.TIT1, "content group description", ID3v24FrameBodyTextInformation.class),
    SONG_TITLE(ID3Frame.TIT2, "title/songname/content description", ID3v24FrameBodyTextInformation.class),
    SUBTITLE_REFINEMENT(ID3Frame.TIT3, "subtitle/description refinement", ID3v24FrameBodyTextInformation.class),
    INITIAL_KEY("TKEY", "initial key", ID3v24FrameBodyTextInformation.class),
    LANGUAGE("TLAN", "language(s)", ID3v24FrameBodyTextInformation.class),
    LENGTH("TLEN", "length of the song (in ms)", ID3v24FrameBodyTextInformation.class),
    MUSICIANS_CREDIT_LIST("TMCL", "musician credits list", ID3v24FrameBodyTextInformation.class),
    MEDIA_TYPE("TMED", "media type", ID3v24FrameBodyTextInformation.class),
    MOOD("TMOO", "mood", ID3v24FrameBodyTextInformation.class),
    ORIGINAL_ALBUM_TITLE("TOAL", "original album/movie/show title", ID3v24FrameBodyTextInformation.class),
    ORIGINAL_FILENAME("TOFN", "original filename", ID3v24FrameBodyTextInformation.class),
    ORIGINAL_LYRICIST("TOLY", "original lyricist(s)/text writer(s)", ID3v24FrameBodyTextInformation.class),
    ORIGINAL_ARTIST("TOPE", "original artist(s)/performer(s)", ID3v24FrameBodyTextInformation.class),
    FILE_OWNER("TOWN", "file owner/licensee", ID3v24FrameBodyTextInformation.class),
    LEAD_PERFORMER(ID3Frame.TPE1, "lead performer(s)/soloist(s)", ID3v24FrameBodyTextInformation.class),
    BAND(ID3Frame.TPE2, "band/orchestra/accompaniment", ID3v24FrameBodyTextInformation.class),
    CONDUCTOR(ID3Frame.TPE3, "conductor/performer refinement", ID3v24FrameBodyTextInformation.class),
    INTERPRETED_MODIFIED_BY(ID3Frame.TPE4, "interpreted, remixed, or otherwise modified by", ID3v24FrameBodyTextInformation.class),
    PART_OF_A_SET("TPOS", "part of a set", ID3v24FrameBodyTextInformation.class),
    PRODUCED_NOTICE("TPRO", "produced notice", ID3v24FrameBodyTextInformation.class),
    PUBLISHER("TPUB", "publisher", ID3v24FrameBodyTextInformation.class),
    TRACK_NUMBER("TRCK", "track number/position in set", ID3v24FrameBodyTextInformation.class),
    INTERNET_RADIO_STATION_NAME("TRSN", "internet radio station name", ID3v24FrameBodyTextInformation.class),
    INTERNET_RADIO_STATION_OWNER("TRSO", "internet radio station owner", ID3v24FrameBodyTextInformation.class),
    ALBUM_SORT_ORDER("TSOA", "album sort order", ID3v24FrameBodyTextInformation.class),
    PERFORMER_SORT_ORDER("TSOP", "performer sort order", ID3v24FrameBodyTextInformation.class),
    TITLE_SORT_ORDER("TSOT", "title sort order", ID3v24FrameBodyTextInformation.class),
    INTERNATIONAL_STANDARD_RECORDING_CODE("TSRC", "isrc (international standard recording code)", ID3v24FrameBodyTextInformation.class),
    SOFTWARE_HARDWARE_ENCODING_SETTINGS("TSSE", "software/hardware and settings used for encoding", ID3v24FrameBodyTextInformation.class),
    SET_SUBTITLE("TSST", "set subtitle", ID3v24FrameBodyTextInformation.class),
    USER_DEFINED_TEXT_INFORMATION("TXXX", "user defined text information frame", ID3v24FrameBodyUserDefinedTextInformation.class),
    UNIQUE_FILE_IDENTIFIER("UFID", "unique file identifier", ID3v24FrameBodyUniqueFileIdentifier.class),
    TERMS_OF_USE("USER", "terms of use", ID3v24FrameBodyTermsOfUse.class),
    UNSYCHRONIZED_LYRICS("USLT", "unsychronized lyrics/text transcription", ID3v24FrameBodyUnsynchronizedLyrics.class),
    COMMERCIAL_INFORMATION("WCOM", "commercial information", ID3v24FrameBodyURLLink.class),
    COPYRIGHT_LEGAL_INFORMATION("WCOP", "copyright/legal information", ID3v24FrameBodyURLLink.class),
    OFFICIAL_AUDIO_FILE_WEBPAGE("WOAF", "official audio file webpage", ID3v24FrameBodyURLLink.class),
    OFFICIAL_ARTIST_WEBPAGE("WOAR", "official artist/performer webpage", ID3v24FrameBodyURLLink.class),
    OFFICIAL_AUDIO_SOURCE_WEBPAGE("WOAS", "official audio source webpage", ID3v24FrameBodyURLLink.class),
    OFFICIAL_INTERNET_RADIO_STATION_HOMEPAGE("WORS", "official internet radio station homepage", ID3v24FrameBodyURLLink.class),
    PAYMENT("WPAY", "payment", ID3v24FrameBodyURLLink.class),
    PUBLISHERS_OFFICIAL_WEBPAGE("WPUB", "publishers official webpage", ID3v24FrameBodyURLLink.class),
    USER_DEFINED_URL_LINK_FRAME("WXXX", "user defined url link", ID3v24FrameBodyUserDefinedURLLink.class);

    public static final int FRAME_ID_LENGTH = 4;
    private String description;
    private Class<?> frameBodyClass;
    private Constructor<?> frameBodyConstructor;
    private String id;

    FrameType(String str, String str2, Class cls) {
        this.id = str;
        this.description = str2;
        this.frameBodyClass = cls;
        try {
            if (cls == ID3v24FrameBodyTextInformation.class || cls == ID3v24FrameBodyURLLink.class) {
                this.frameBodyConstructor = cls.getConstructor(InputStream.class, FrameType.class, Integer.TYPE);
            } else {
                this.frameBodyConstructor = cls.getConstructor(InputStream.class, Integer.TYPE);
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static FrameType getFrameType(String str) throws IllegalArgumentException {
        for (FrameType frameType : values()) {
            if (str.equals(frameType.getId())) {
                return frameType;
            }
        }
        throw new IllegalArgumentException("Invalid ID3v2.4 frame type " + str + ".");
    }

    public String getDescription() {
        return this.description;
    }

    public Class<?> getFrameBodyClass() {
        return this.frameBodyClass;
    }

    public Constructor<?> getFrameBodyConstructor() {
        return this.frameBodyConstructor;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return super.toString();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.id + ": " + getName() + " - " + this.description;
    }
}
