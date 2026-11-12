package com.beaglebuddy.mp3;

import com.beaglebuddy.id3.enums.Genre;
import com.beaglebuddy.id3.enums.Language;
import com.beaglebuddy.id3.enums.PictureType;
import com.beaglebuddy.id3.enums.v24.Encoding;
import com.beaglebuddy.id3.enums.v24.FrameType;
import com.beaglebuddy.id3.pojo.AttachedPicture;
import com.beaglebuddy.id3.pojo.SynchronizedLyric;
import com.beaglebuddy.id3.v24.ID3v24Frame;
import com.beaglebuddy.id3.v24.ID3v24Tag;
import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodyAttachedPicture;
import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodyComments;
import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodyPopularimeter;
import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodySynchronizedLyricsText;
import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodyTextInformation;
import com.beaglebuddy.id3.v24.frame_body.ID3v24FrameBodyUnsynchronizedLyrics;
import com.beaglebuddy.util.Utility;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public class MP3BaseID3v24 extends MP3BaseID3v23 {
    public ID3v24Tag id3v24Tag;

    public ID3v24Frame addV24Frame(FrameType frameType) {
        return this.id3v24Tag.addFrame(frameType);
    }

    public ID3v24Tag getID3v24Tag() {
        return this.id3v24Tag;
    }

    public String getV24Album() {
        return getV24Text(FrameType.ALBUM_TITLE);
    }

    public AttachedPicture getV24AttachedPicture(PictureType pictureType) {
        ID3v24Frame v24AttachedPictureFrame = getV24AttachedPictureFrame(pictureType);
        if (v24AttachedPictureFrame != null) {
            return ((ID3v24FrameBodyAttachedPicture) v24AttachedPictureFrame.getBody()).getAttachedPicture();
        }
        return null;
    }

    public ID3v24Frame getV24AttachedPictureFrame(PictureType pictureType) {
        ID3v24Frame iD3v24Frame = null;
        for (ID3v24Frame iD3v24Frame2 : getV24Frames(FrameType.ATTACHED_PICTURE)) {
            if (((ID3v24FrameBodyAttachedPicture) iD3v24Frame2.getBody()).getPictureType() == pictureType) {
                iD3v24Frame = iD3v24Frame2;
            }
        }
        return iD3v24Frame;
    }

    public List<AttachedPicture> getV24AttachedPictures() {
        List<ID3v24Frame> v24Frames = getV24Frames(FrameType.ATTACHED_PICTURE);
        Vector vector = new Vector();
        if (v24Frames.size() != 0) {
            Iterator<ID3v24Frame> it2 = v24Frames.iterator();
            while (it2.hasNext()) {
                vector.add(((ID3v24FrameBodyAttachedPicture) it2.next().getBody()).getAttachedPicture());
            }
        }
        return vector;
    }

    public int getV24AudioDuration() {
        return getV24TextAsInteger(FrameType.LENGTH) / 1000;
    }

    public String getV24Band() {
        return getV24Text(FrameType.BAND);
    }

    public String getV24Comments(Language language) throws IllegalArgumentException {
        ID3v24Frame v24CommentsFrame = getV24CommentsFrame(language);
        if (v24CommentsFrame == null) {
            return null;
        }
        return ((ID3v24FrameBodyComments) v24CommentsFrame.getBody()).getText();
    }

    public ID3v24Frame getV24CommentsFrame(Language language) {
        ID3v24Frame iD3v24Frame = null;
        for (ID3v24Frame iD3v24Frame2 : getV24Frames(FrameType.COMMENTS)) {
            if (((ID3v24FrameBodyComments) iD3v24Frame2.getBody()).getLanguage() == language) {
                iD3v24Frame = iD3v24Frame2;
            }
        }
        return iD3v24Frame;
    }

    public int getV24Disc() {
        return getV24TextAsInteger(FrameType.PART_OF_A_SET);
    }

    public List<String> getV24Errors() {
        Vector vector = new Vector();
        Iterator<ID3v24Frame> it2 = this.id3v24Tag.getInvalidFrames().iterator();
        while (it2.hasNext()) {
            vector.add(it2.next().getInvalidMessage());
        }
        return vector;
    }

    public ID3v24Frame getV24Frame(FrameType frameType) {
        return this.id3v24Tag.getFrame(frameType);
    }

    public List<ID3v24Frame> getV24Frames(FrameType frameType) {
        return this.id3v24Tag.getFrames(frameType);
    }

    public String getV24LeadPerformer() {
        return getV24Text(FrameType.LEAD_PERFORMER);
    }

    public String getV24LyricsBy() {
        return getV24Text(FrameType.LYRICIST);
    }

    public String getV24MusicBy() {
        return getV24Text(FrameType.COMPOSER);
    }

    public String getV24MusicType() {
        return getV24Text(FrameType.CONTENT_TYPE);
    }

    public String getV24Publisher() {
        return getV24Text(FrameType.PUBLISHER);
    }

    public int getV24Rating() {
        ID3v24Frame v24Frame = getV24Frame(FrameType.POPULARIMETER);
        if (v24Frame == null) {
            return 0;
        }
        return ((ID3v24FrameBodyPopularimeter) v24Frame.getBody()).getRating();
    }

    public List<SynchronizedLyric> getV24SynchronizedLyrics(Language language) {
        ID3v24Frame v24SynchronizedLyricsFrame = getV24SynchronizedLyricsFrame(language);
        if (v24SynchronizedLyricsFrame == null) {
            return null;
        }
        return ((ID3v24FrameBodySynchronizedLyricsText) v24SynchronizedLyricsFrame.getBody()).getSynchronizedLyrics();
    }

    public ID3v24Frame getV24SynchronizedLyricsFrame(Language language) {
        ID3v24Frame iD3v24Frame = null;
        for (ID3v24Frame iD3v24Frame2 : getV24Frames(FrameType.SYNCHRONIZED_LYRIC_TEXT)) {
            if (((ID3v24FrameBodySynchronizedLyricsText) iD3v24Frame2.getBody()).getLanguage() == language) {
                iD3v24Frame = iD3v24Frame2;
            }
        }
        return iD3v24Frame;
    }

    public String getV24Text(FrameType frameType) {
        ID3v24Frame v24Frame = getV24Frame(frameType);
        if (v24Frame == null) {
            return null;
        }
        return ((ID3v24FrameBodyTextInformation) v24Frame.getBody()).getText();
    }

    public int getV24TextAsInteger(FrameType frameType) {
        String text;
        int iIndexOf;
        int i;
        ID3v24Frame v24Frame = getV24Frame(frameType);
        if (v24Frame == null) {
            return 0;
        }
        ID3v24FrameBodyTextInformation iD3v24FrameBodyTextInformation = (ID3v24FrameBodyTextInformation) v24Frame.getBody();
        try {
            i = Integer.parseInt(iD3v24FrameBodyTextInformation.getText());
            if (i < 0) {
                return 0;
            }
        } catch (NumberFormatException unused) {
            if ((frameType != FrameType.TRACK_NUMBER && frameType != FrameType.PART_OF_A_SET) || (iIndexOf = (text = iD3v24FrameBodyTextInformation.getText()).indexOf(47)) == -1) {
                return 0;
            }
            try {
                i = Integer.parseInt(text.substring(0, iIndexOf));
                if (i < 0) {
                    return 0;
                }
            } catch (NumberFormatException unused2) {
                return 0;
            }
        }
        return i;
    }

    public String getV24Title() {
        return getV24Text(FrameType.SONG_TITLE);
    }

    public int getV24Track() {
        return getV24TextAsInteger(FrameType.TRACK_NUMBER);
    }

    public String getV24UnsynchronizedLyrics(Language language) {
        ID3v24Frame v24UnsynchronizedLyricsFrame = getV24UnsynchronizedLyricsFrame(language);
        if (v24UnsynchronizedLyricsFrame == null) {
            return null;
        }
        return ((ID3v24FrameBodyUnsynchronizedLyrics) v24UnsynchronizedLyricsFrame.getBody()).getText();
    }

    public ID3v24Frame getV24UnsynchronizedLyricsFrame(Language language) {
        ID3v24Frame iD3v24Frame = null;
        for (ID3v24Frame iD3v24Frame2 : getV24Frames(FrameType.UNSYCHRONIZED_LYRICS)) {
            if (((ID3v24FrameBodyUnsynchronizedLyrics) iD3v24Frame2.getBody()).getLanguage() == language) {
                iD3v24Frame = iD3v24Frame2;
            }
        }
        return iD3v24Frame;
    }

    public int getV24Year() {
        return getV24TextAsInteger(FrameType.RECORDING_TIME);
    }

    public boolean hasV24Errors() {
        return this.id3v24Tag.getInvalidFrames().size() != 0;
    }

    public ID3v24Frame removeV24Album() {
        return removeV24Frame(FrameType.ALBUM_TITLE);
    }

    public ID3v24Frame removeV24AttachedPicture(PictureType pictureType) {
        ID3v24Frame v24AttachedPictureFrame = getV24AttachedPictureFrame(pictureType);
        if (v24AttachedPictureFrame != null) {
            this.id3v24Tag.getFrames().remove(v24AttachedPictureFrame);
        }
        return v24AttachedPictureFrame;
    }

    public List<AttachedPicture> removeV24AttachedPictures() {
        List<ID3v24Frame> listRemoveV24Frames = removeV24Frames(FrameType.ATTACHED_PICTURE);
        Vector vector = new Vector();
        if (listRemoveV24Frames.size() != 0) {
            Iterator<ID3v24Frame> it2 = listRemoveV24Frames.iterator();
            while (it2.hasNext()) {
                vector.add(((ID3v24FrameBodyAttachedPicture) it2.next().getBody()).getAttachedPicture());
            }
        }
        return vector;
    }

    public ID3v24Frame removeV24AudioDuration() {
        return removeV24Frame(FrameType.LENGTH);
    }

    public void removeV24AudioSize() {
    }

    public ID3v24Frame removeV24Band() {
        return removeV24Frame(FrameType.BAND);
    }

    public ID3v24Frame removeV24Comments() throws IllegalStateException {
        return removeV24Comments(Language.ENG);
    }

    public ID3v24Frame removeV24Disc() {
        return removeV24Frame(FrameType.PART_OF_A_SET);
    }

    public ID3v24Frame removeV24Frame(FrameType frameType) {
        return this.id3v24Tag.removeFrame(frameType);
    }

    public List<ID3v24Frame> removeV24Frames(FrameType frameType) {
        return this.id3v24Tag.removeFrames(frameType);
    }

    public ID3v24Frame removeV24LeadPerformer() {
        return removeV24Frame(FrameType.LEAD_PERFORMER);
    }

    public ID3v24Frame removeV24LyricsBy() {
        return removeV24Frame(FrameType.LYRICIST);
    }

    public ID3v24Frame removeV24MusicBy() {
        return removeV24Frame(FrameType.COMPOSER);
    }

    public ID3v24Frame removeV24MusicType() {
        return removeV24Frame(FrameType.CONTENT_TYPE);
    }

    public ID3v24Frame removeV24Publisher() {
        return removeV24Frame(FrameType.PUBLISHER);
    }

    public ID3v24Frame removeV24Rating() {
        return removeV24Frame(FrameType.POPULARIMETER);
    }

    public ID3v24Frame removeV24SynchronizedLyrics(Language language) {
        ID3v24Frame v24SynchronizedLyricsFrame = getV24SynchronizedLyricsFrame(language);
        if (v24SynchronizedLyricsFrame != null) {
            this.id3v24Tag.getFrames().remove(v24SynchronizedLyricsFrame);
        }
        return v24SynchronizedLyricsFrame;
    }

    public ID3v24Frame removeV24Title() {
        return removeV24Frame(FrameType.SONG_TITLE);
    }

    public ID3v24Frame removeV24Track() {
        return removeV24Frame(FrameType.TRACK_NUMBER);
    }

    public ID3v24Frame removeV24UnsynchronizedLyrics(Language language) {
        ID3v24Frame v24UnsynchronizedLyricsFrame = getV24UnsynchronizedLyricsFrame(language);
        if (v24UnsynchronizedLyricsFrame != null) {
            this.id3v24Tag.getFrames().remove(v24UnsynchronizedLyricsFrame);
        }
        return v24UnsynchronizedLyricsFrame;
    }

    public ID3v24Frame removeV24Year() {
        return removeV24Frame(FrameType.RECORDING_TIME);
    }

    public ID3v24Frame setV24Album(String str) {
        return setV24Text(str, FrameType.ALBUM_TITLE);
    }

    public ID3v24Frame setV24AttachedPicture(AttachedPicture attachedPicture) {
        ID3v24Frame v24AttachedPictureFrame = getV24AttachedPictureFrame(attachedPicture.getPictureType());
        if (v24AttachedPictureFrame == null) {
            v24AttachedPictureFrame = addV24Frame(FrameType.ATTACHED_PICTURE);
        }
        ID3v24FrameBodyAttachedPicture iD3v24FrameBodyAttachedPicture = (ID3v24FrameBodyAttachedPicture) v24AttachedPictureFrame.getBody();
        iD3v24FrameBodyAttachedPicture.setEncoding(Encoding.UTF_16);
        iD3v24FrameBodyAttachedPicture.setMimeType(attachedPicture.getMimeType());
        iD3v24FrameBodyAttachedPicture.setPictureType(attachedPicture.getPictureType());
        iD3v24FrameBodyAttachedPicture.setDescription(attachedPicture.getDescription());
        iD3v24FrameBodyAttachedPicture.setImage(attachedPicture.getImage());
        return v24AttachedPictureFrame;
    }

    public ID3v24Frame setV24AudioDuration(int i) throws IllegalArgumentException {
        if (i >= 0) {
            return setV24Text(i * 1000, FrameType.LENGTH);
        }
        throw new IllegalArgumentException("Invalid audio duration, " + i + ", specified.  It must be greater than or equal to 0.");
    }

    public ID3v24Frame setV24Band(String str) {
        return setV24Text(str, FrameType.BAND);
    }

    public ID3v24Frame setV24Comments(Language language, String str) throws IllegalArgumentException {
        if (str == null || str.trim().length() == 0) {
            throw new IllegalArgumentException("Invalid comments.  They can not be null or empty.");
        }
        ID3v24Frame v24CommentsFrame = getV24CommentsFrame(language);
        if (v24CommentsFrame == null) {
            v24CommentsFrame = addV24Frame(FrameType.COMMENTS);
        }
        ID3v24FrameBodyComments iD3v24FrameBodyComments = (ID3v24FrameBodyComments) v24CommentsFrame.getBody();
        iD3v24FrameBodyComments.setEncoding(Encoding.UTF_16);
        iD3v24FrameBodyComments.setLanguage(language);
        iD3v24FrameBodyComments.setText(str);
        return v24CommentsFrame;
    }

    public ID3v24Frame setV24Disc(int i) throws IllegalArgumentException {
        if (i > 0) {
            return setV24Text(i, FrameType.PART_OF_A_SET);
        }
        throw new IllegalArgumentException("Invalid disc number specified, " + i + ".  It must be greater than or equal to 1.");
    }

    public ID3v24Frame setV24LeadPerformer(String str) {
        return setV24Text(str, FrameType.LEAD_PERFORMER);
    }

    public ID3v24Frame setV24LyricsBy(String str) {
        return setV24Text(str, FrameType.LYRICIST);
    }

    public ID3v24Frame setV24MusicBy(String str) {
        return setV24Text(str, FrameType.COMPOSER);
    }

    public ID3v24Frame setV24MusicType(Genre genre) {
        return setV24MusicType(genre.toString());
    }

    public ID3v24Frame setV24Publisher(String str) {
        return setV24Text(str, FrameType.PUBLISHER);
    }

    public ID3v24Frame setV24Rating(int i) {
        if (i >= 0 && i <= 255) {
            FrameType frameType = FrameType.POPULARIMETER;
            ID3v24Frame v24Frame = getV24Frame(frameType);
            if (v24Frame == null) {
                v24Frame = addV24Frame(frameType);
            }
            ((ID3v24FrameBodyPopularimeter) v24Frame.getBody()).setRating(i);
            return v24Frame;
        }
        throw new IllegalArgumentException("Invalid rating, " + i + ".  It must be between 0 and 255.");
    }

    public ID3v24Frame setV24SynchronizedLyrics(List<SynchronizedLyric> list) {
        return setV24SynchronizedLyrics(Encoding.UTF_16, Language.ENG, list);
    }

    public ID3v24Frame setV24Text(String str, FrameType frameType) {
        return setV24Text(Encoding.UTF_16, str, frameType);
    }

    public ID3v24Frame setV24Title(String str) {
        return setV24Text(str, FrameType.SONG_TITLE);
    }

    public ID3v24Frame setV24Track(int i) throws IllegalArgumentException {
        if (i > 0) {
            return setV24Text(i, FrameType.TRACK_NUMBER);
        }
        throw new IllegalArgumentException("Invalid track number specified, " + i + ".  It must be greater than or equal to 1.");
    }

    public ID3v24Frame setV24UnsynchronizedLyrics(Language language, String str) {
        ID3v24Frame v24UnsynchronizedLyricsFrame = getV24UnsynchronizedLyricsFrame(language);
        if (v24UnsynchronizedLyricsFrame == null) {
            v24UnsynchronizedLyricsFrame = addV24Frame(FrameType.UNSYCHRONIZED_LYRICS);
        }
        ID3v24FrameBodyUnsynchronizedLyrics iD3v24FrameBodyUnsynchronizedLyrics = (ID3v24FrameBodyUnsynchronizedLyrics) v24UnsynchronizedLyricsFrame.getBody();
        iD3v24FrameBodyUnsynchronizedLyrics.setEncoding(Encoding.UTF_16);
        iD3v24FrameBodyUnsynchronizedLyrics.setLanguage(language);
        iD3v24FrameBodyUnsynchronizedLyrics.setText(str);
        return v24UnsynchronizedLyricsFrame;
    }

    public ID3v24Frame setV24Year(int i) throws IllegalArgumentException {
        if (i > 0) {
            return setV24Text(i, FrameType.RECORDING_TIME);
        }
        throw new IllegalArgumentException("Invalid year, " + i + ", specified.  It must be greater than or equal to 1.");
    }

    public ID3v24Frame removeV24Comments(Language language) throws IllegalArgumentException {
        ID3v24Frame v24CommentsFrame = getV24CommentsFrame(language);
        if (v24CommentsFrame != null) {
            this.id3v24Tag.getFrames().remove(v24CommentsFrame);
        }
        return v24CommentsFrame;
    }

    public ID3v24Frame setV24MusicType(String str) {
        return setV24Text(str, FrameType.CONTENT_TYPE);
    }

    public ID3v24Frame setV24SynchronizedLyrics(Language language, List<SynchronizedLyric> list) throws IllegalArgumentException {
        return setV24SynchronizedLyrics(Encoding.UTF_16, language, list);
    }

    public ID3v24Frame setV24Text(int i, FrameType frameType) throws IllegalArgumentException {
        if (i > 0) {
            return setV24Text(Encoding.ISO_8859_1, String.valueOf(i), frameType);
        }
        throw new IllegalArgumentException("Invalid number specified, " + i + ".  It must be greater than or equal to 1.");
    }

    public ID3v24Frame setV24SynchronizedLyrics(Encoding encoding, Language language, List<SynchronizedLyric> list) throws IllegalArgumentException {
        ID3v24Frame v24SynchronizedLyricsFrame = getV24SynchronizedLyricsFrame(language);
        if (v24SynchronizedLyricsFrame == null) {
            v24SynchronizedLyricsFrame = addV24Frame(FrameType.SYNCHRONIZED_LYRIC_TEXT);
        }
        ID3v24FrameBodySynchronizedLyricsText iD3v24FrameBodySynchronizedLyricsText = (ID3v24FrameBodySynchronizedLyricsText) v24SynchronizedLyricsFrame.getBody();
        iD3v24FrameBodySynchronizedLyricsText.setEncoding(encoding);
        iD3v24FrameBodySynchronizedLyricsText.setLanguage(language);
        iD3v24FrameBodySynchronizedLyricsText.setSynchronizedLyrics(list);
        return v24SynchronizedLyricsFrame;
    }

    public ID3v24Frame setV24Text(Encoding encoding, String str, FrameType frameType) {
        ID3v24Frame v24Frame = getV24Frame(frameType);
        if (v24Frame == null) {
            v24Frame = addV24Frame(frameType);
        }
        ID3v24FrameBodyTextInformation iD3v24FrameBodyTextInformation = (ID3v24FrameBodyTextInformation) v24Frame.getBody();
        iD3v24FrameBodyTextInformation.setEncoding(encoding);
        iD3v24FrameBodyTextInformation.setText(str);
        if (encoding == Encoding.UTF_16) {
            str = Utility.getUTF16String(str);
        }
        iD3v24FrameBodyTextInformation.setText(str);
        return v24Frame;
    }
}
