package com.beaglebuddy.id3.enums.v23;

import com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBodyAttachedPicture;
import com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBodyAudioEncryption;
import com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBodyComments;
import com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBodyCommercial;
import com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBodyEncryptionMethodRegistration;
import com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBodyEqualization;
import com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBodyEventTimingCodes;
import com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBodyGeneralEncapsulatedObject;
import com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBodyGroupIdentificationRegistration;
import com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBodyInvolvedPeopleList;
import com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBodyLinkedInformation;
import com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBodyMPEGLocationLookupTable;
import com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBodyMusicCDIdentifier;
import com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBodyOwnership;
import com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBodyPlayCounter;
import com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBodyPopularimeter;
import com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBodyPositionSynchronization;
import com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBodyPrivate;
import com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBodyRecommendedBufferSize;
import com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBodyRelativeVolumeAdjustment;
import com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBodyReverb;
import com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBodySynchronizedLyricsText;
import com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBodySynchronizedTempoCodes;
import com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBodyTermsOfUse;
import com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBodyTextInformation;
import com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBodyURLLink;
import com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBodyUniqueFileIdentifier;
import com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBodyUnsynchronizedLyrics;
import com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBodyUserDefinedTextInformation;
import com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBodyUserDefinedURLLink;
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
    AUDIO_ENCRYPTION("AENC", "audio encryption", ID3v23FrameBodyAudioEncryption.class),
    ATTACHED_PICTURE(ApicFrame.ID, "attached picture", ID3v23FrameBodyAttachedPicture.class),
    COMMENTS(CommentFrame.ID, "comments", ID3v23FrameBodyComments.class),
    COMMERCIAL("COMR", "commercial", ID3v23FrameBodyCommercial.class),
    ENCRYPTION_METHOD_REGISTRATION("ENCR", "encryption method registration", ID3v23FrameBodyEncryptionMethodRegistration.class),
    EQUALIZATION("EQUA", "equalization", ID3v23FrameBodyEqualization.class),
    EVENT_TIMING_CODES("ETCO", "event timing codes", ID3v23FrameBodyEventTimingCodes.class),
    GENERAL_ENCAPSULATED_OBJECT(GeobFrame.ID, "general encapsulated object", ID3v23FrameBodyGeneralEncapsulatedObject.class),
    GROUP_IDENTIFICATION_REGISTRATION("GRID", "group identification registration", ID3v23FrameBodyGroupIdentificationRegistration.class),
    INVOLVED_PEOPLE_LIST("IPLS", "involved people list", ID3v23FrameBodyInvolvedPeopleList.class),
    LINKED_INFORMATION(ShareConstants.CONTENT_URL, "linked information", ID3v23FrameBodyLinkedInformation.class),
    MUSIC_CD_IDENTIFIER("MCDI", "music cd identifier", ID3v23FrameBodyMusicCDIdentifier.class),
    MPEG_LOCATION_LOOKUP_TABLE(MlltFrame.ID, "mpeg location lookup table", ID3v23FrameBodyMPEGLocationLookupTable.class),
    OWNERSHIP("OWNE", "ownership", ID3v23FrameBodyOwnership.class),
    PLAY_COUNTER("PCNT", "play counter", ID3v23FrameBodyPlayCounter.class),
    POPULARIMETER("POPM", "popularimeter", ID3v23FrameBodyPopularimeter.class),
    POSITION_SYNCHRONIZATION("POSS", "position synchronization", ID3v23FrameBodyPositionSynchronization.class),
    PRIVATE(PrivFrame.ID, "private", ID3v23FrameBodyPrivate.class),
    RECOMMENDED_BUFFER_SIZE("RBUF", "recommended buffer size", ID3v23FrameBodyRecommendedBufferSize.class),
    RELATIVE_VOLUME_ADJUSTMENT("RVAD", "relative volume adjustment", ID3v23FrameBodyRelativeVolumeAdjustment.class),
    REVERB("RVRB", "reverb settings", ID3v23FrameBodyReverb.class),
    SYNCHRONIZED_LYRIC_TEXT("SYLT", "synchronized lyric/text", ID3v23FrameBodySynchronizedLyricsText.class),
    SYNCHRONIZED_TEMPO_CODES("SYTC", "synchronized tempo codes", ID3v23FrameBodySynchronizedTempoCodes.class),
    ALBUM_TITLE("TALB", "album/movie/show title", ID3v23FrameBodyTextInformation.class),
    BEATS_PER_MINUTE("TBPM", "bpm (beats per minute)", ID3v23FrameBodyTextInformation.class),
    COMPOSER("TCOM", g.c, ID3v23FrameBodyTextInformation.class),
    CONTENT_TYPE("TCON", "content type", ID3v23FrameBodyTextInformation.class),
    COPYRIGHT_MESSAGE("TCOP", "copyright message", ID3v23FrameBodyTextInformation.class),
    DATE("TDAT", "date", ID3v23FrameBodyTextInformation.class),
    PLAYLIST_DELAY("TDLY", "playlist delay", ID3v23FrameBodyTextInformation.class),
    ENCODED_BY("TENC", "encoded by", ID3v23FrameBodyTextInformation.class),
    LYRICIST("TEXT", "lyricist/text writer", ID3v23FrameBodyTextInformation.class),
    FILE_TYPE("TFLT", "file type", ID3v23FrameBodyTextInformation.class),
    TIME("TIME", "time", ID3v23FrameBodyTextInformation.class),
    CONTENT_GROUP_DESCRIPTION(ID3Frame.TIT1, "content group description", ID3v23FrameBodyTextInformation.class),
    SONG_TITLE(ID3Frame.TIT2, "title/songname/content description", ID3v23FrameBodyTextInformation.class),
    SUBTITLE_REFINEMENT(ID3Frame.TIT3, "subtitle/description refinement", ID3v23FrameBodyTextInformation.class),
    INITIAL_KEY("TKEY", "initial key", ID3v23FrameBodyTextInformation.class),
    LANGUAGE("TLAN", "language(s)", ID3v23FrameBodyTextInformation.class),
    LENGTH("TLEN", "length of the song (in ms)", ID3v23FrameBodyTextInformation.class),
    MEDIA_TYPE("TMED", "media type", ID3v23FrameBodyTextInformation.class),
    ORIGINAL_ALBUM_TITLE("TOAL", "original album/movie/show title", ID3v23FrameBodyTextInformation.class),
    ORIGINAL_FILENAME("TOFN", "original filename", ID3v23FrameBodyTextInformation.class),
    ORIGINAL_LYRICIST("TOLY", "original lyricist(s)/text writer(s)", ID3v23FrameBodyTextInformation.class),
    ORIGINAL_ARTIST("TOPE", "original artist(s)/performer(s)", ID3v23FrameBodyTextInformation.class),
    ORIGINAL_RELEASE_YEAR("TORY", "original release year", ID3v23FrameBodyTextInformation.class),
    FILE_OWNER("TOWN", "file owner/licensee", ID3v23FrameBodyTextInformation.class),
    LEAD_PERFORMER(ID3Frame.TPE1, "lead performer(s)/soloist(s)", ID3v23FrameBodyTextInformation.class),
    BAND(ID3Frame.TPE2, "band/orchestra/accompaniment", ID3v23FrameBodyTextInformation.class),
    CONDUCTOR(ID3Frame.TPE3, "conductor/performer refinement", ID3v23FrameBodyTextInformation.class),
    INTERPRETED_MODIFIED_BY(ID3Frame.TPE4, "interpreted, remixed, or otherwise modified by", ID3v23FrameBodyTextInformation.class),
    PART_OF_A_SET("TPOS", "part of a set", ID3v23FrameBodyTextInformation.class),
    PUBLISHER("TPUB", "publisher", ID3v23FrameBodyTextInformation.class),
    TRACK_NUMBER("TRCK", "track number/position in set", ID3v23FrameBodyTextInformation.class),
    RECORDING_DATES("TRDA", "recording dates", ID3v23FrameBodyTextInformation.class),
    INTERNET_RADIO_STATION_NAME("TRSN", "internet radio station name", ID3v23FrameBodyTextInformation.class),
    INTERNET_RADIO_STATION_OWNER("TRSO", "internet radio station owner", ID3v23FrameBodyTextInformation.class),
    SIZE("TSIZ", "size of the audio portion of the .mp3 file (in bytes)", ID3v23FrameBodyTextInformation.class),
    INTERNATIONAL_STANDARD_RECORDING_CODE("TSRC", "isrc (international standard recording code)", ID3v23FrameBodyTextInformation.class),
    SOFTWARE_HARDWARE_ENCODING_SETTINGS("TSSE", "software/hardware and settings used for encoding", ID3v23FrameBodyTextInformation.class),
    YEAR("TYER", "year the song was recorded", ID3v23FrameBodyTextInformation.class),
    USER_DEFINED_TEXT_INFORMATION("TXXX", "user defined text information frame", ID3v23FrameBodyUserDefinedTextInformation.class),
    UNIQUE_FILE_IDENTIFIER("UFID", "unique file identifier", ID3v23FrameBodyUniqueFileIdentifier.class),
    TERMS_OF_USE("USER", "terms of use", ID3v23FrameBodyTermsOfUse.class),
    UNSYCHRONIZED_LYRICS("USLT", "unsychronized lyrics/text transcription", ID3v23FrameBodyUnsynchronizedLyrics.class),
    COMMERCIAL_INFORMATION("WCOM", "commercial information", ID3v23FrameBodyURLLink.class),
    COPYRIGHT_LEGAL_INFORMATION("WCOP", "copyright/legal information", ID3v23FrameBodyURLLink.class),
    OFFICIAL_AUDIO_FILE_WEBPAGE("WOAF", "official audio file webpage", ID3v23FrameBodyURLLink.class),
    OFFICIAL_ARTIST_WEBPAGE("WOAR", "official artist/performer webpage", ID3v23FrameBodyURLLink.class),
    OFFICIAL_AUDIO_SOURCE_WEBPAGE("WOAS", "official audio source webpage", ID3v23FrameBodyURLLink.class),
    OFFICIAL_INTERNET_RADIO_STATION_HOMEPAGE("WORS", "official internet radio station homepage", ID3v23FrameBodyURLLink.class),
    PAYMENT("WPAY", "payment", ID3v23FrameBodyURLLink.class),
    PUBLISHERS_OFFICIAL_WEBPAGE("WPUB", "publishers official webpage", ID3v23FrameBodyURLLink.class),
    USER_DEFINED_URL_LINK_FRAME("WXXX", "user defined url link", ID3v23FrameBodyUserDefinedURLLink.class);

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
            if (cls == ID3v23FrameBodyTextInformation.class || cls == ID3v23FrameBodyURLLink.class) {
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
        throw new IllegalArgumentException("Invalid frame type " + str + ".");
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
